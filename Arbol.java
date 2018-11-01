
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
    
    
    
}
