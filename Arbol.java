
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
    public int encontrarBrazo(NodoArbol nodo,int pDato){
        if(nodo.nodoDer.datos == pDato){
            return 1;
        }else{
            return 2;
        }
    }
    
    public void deleteNodo(NodoArbol nodo,NodoArbol nodoSiguiente,int pDato){
        int direccion = 0;
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
            }else{
                direccion = encontrarBrazo(nodo,pDato);
                if(direccion == 1){
                    if(nodoSiguiente.nodoDer == null){
                        nodo.nodoDer = nodoSiguiente.nodoIzq;
                    }else if(nodoSiguiente.nodoIzq == null){
                        nodo.nodoDer = nodoSiguiente.nodoDer;
                    }
                }else if(direccion == 2){
                    if(nodoSiguiente.nodoIzq == null){
                        nodo.nodoIzq = nodoSiguiente.nodoIzq;
                    }else if(nodoSiguiente.nodoIzq == null){
                        nodo.nodoIzq = nodoSiguiente.nodoDer;
                    }
                }
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
    public void infoParaEliminar(int pDato){
        NodoArbol nodo = buscarNodoPorValor(raiz,pDato);
        if(nodo.datos > pDato){
            printLowerValue(nodo.nodoIzq.nodoDer);
        }else if (nodo.datos<pDato){
            printLowerValue(nodo.nodoDer.nodoDer);
        }
    }
    public void printLowerValue(NodoArbol main){
        NodoArbol nodo;
        nodo = getLowestDerechaNodo(main);
        System.out.println("");
        System.out.println("El valor del nodo es:"+nodo.datos);
    }
    
    //Metodo que regresa cual es el dato mas pequeño  de un arbol.
    public NodoArbol getLowestDerechaNodo(NodoArbol nodo){
        if(nodo == null){
            return null;
        }
        if(nodo.nodoIzq == null && nodo.nodoDer == null){
            return nodo;
        }
        if(nodo.nodoIzq != null){
            return getLowestDerechaNodo(nodo.nodoIzq);
        }else{
            return nodo;
        }
        
    }
    
    public void mostrarNodoEncontrado(int pDato){
        NodoArbol nodo;
        nodo = buscarNodoPorValor(raiz,pDato);
        System.out.println("");
        System.out.println("Valor:"+ nodo.datos);
    }
    
    public NodoArbol buscarNodoPorValor(NodoArbol node,int pDato){
        if (node == null){
            return null;
        }
        if(pDato < node.datos){
            if(pDato == node.nodoIzq.datos){
                return node;
            }else{
                return buscarNodoPorValor(node.nodoIzq,pDato);
            }
            
        }else{
            if(pDato == node.nodoDer.datos){
                return node;
            }else{
                 return buscarNodoPorValor(node.nodoDer,pDato);
            }
        
        }
        
    }
    
    
    
}
