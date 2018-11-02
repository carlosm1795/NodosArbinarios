
package arbolesbinarios;


public class Arbol {
    private NodoArbol raiz;
    
    
    public Arbol(){
        raiz = null;
    }
    
    public void insertarNodo( int valorInsertar ){
        if ( raiz == null ){
            raiz = new NodoArbol( valorInsertar );
        }else{
            raiz.insertar( valorInsertar );
        }
    }
    
    public void recorridoPreorden(){
        ayudantePreorden( raiz );
    }
    
    private void ayudantePreorden( NodoArbol nodo ){
        if ( nodo == null ){
            return;
        }
        System.out.printf( "%d ", nodo.datos );
        ayudantePreorden( nodo.nodoIzq );
        ayudantePreorden( nodo.nodoDer );
    }
 

    
    public void recorridoInorden(){
        ayudanteInorden( raiz );
    }
    
    private void ayudanteInorden( NodoArbol nodo ){
        if ( nodo == null ){
            return;
            
        }
        ayudanteInorden( nodo.nodoIzq );
        System.out.printf( "%d ", nodo.datos );
        
        ayudanteInorden( nodo.nodoDer );
  
    }
    public void recorridoPostorden(){
        ayudantePostorden( raiz );
    }
    private void ayudantePostorden( NodoArbol nodo ){
        if ( nodo == null ){
           return; 
        }
        ayudantePostorden( nodo.nodoIzq );
        ayudantePostorden( nodo.nodoDer );
        System.out.printf( "%d ", nodo.datos );
    }
    
    public void eliminarNodo(int pDato){
        boolean nodoEncontrado = buscarNodo(raiz,pDato);
        if(nodoEncontrado == true){
            if(pDato>raiz.datos){
                deleteNodo(raiz,raiz.nodoDer,pDato);
            }else{
                    deleteNodo(raiz,raiz.nodoIzq,pDato);
            }
            
        }else{
            System.out.println("Numero no encontrado" );
        }
        
    }
    
    public void deleteNodo(NodoArbol nodo,NodoArbol nodoSiguiente,int pDato){
        if (nodo == null){
            return;
        }
        if (pDato == nodoSiguiente.datos){
            if(nodoSiguiente.nodoDer == null && nodoSiguiente.nodoIzq == null){
                if(nodo.nodoDer == nodoSiguiente){
                    nodo.nodoDer = null;
                }else{
                        nodo.nodoIzq = null;
                }
                return;
            }
            
        }else if (nodoSiguiente.datos>pDato){
             deleteNodo(nodoSiguiente,nodoSiguiente.nodoIzq,pDato);
        }else{
             deleteNodo(nodoSiguiente,nodoSiguiente.nodoDer,pDato);
        }
    }
    
    public int getLeafCount(NodoArbol node)  
    { 
        if (node == null) 
            return 0; 
        if (node.nodoDer == null && node.nodoIzq == null) 
            return 1; 
        else
            return getLeafCount(node.nodoDer) + getLeafCount(node.nodoIzq)+1; 
    } 
    public void search(){
        System.out.println(buscarNodo(raiz,10));
    }
    public boolean buscarNodo(NodoArbol node,int pDato){
        if (node == null){
            return false;
        }
        if (pDato == node.datos){
            return true;
        }else if (node.datos>pDato){
            return buscarNodo(node.nodoIzq,pDato);
        }else{
            return buscarNodo(node.nodoDer,pDato);
        }
        
    }
    
    
    
}
