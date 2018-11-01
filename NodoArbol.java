
package arbolesbinarios;


public class NodoArbol {
    public int datos;
    public NodoArbol nodoDer;
    public NodoArbol nodoIzq;;
    
    public NodoArbol(int datosNodo){
        datos = datosNodo;
        nodoDer = nodoIzq = null;
    }
    
    public void insertar( int valorInsertar )
    {
        // inserta en el subárbol izquierdo
        if ( valorInsertar < datos ){
            if ( nodoIzq == null ){
                nodoIzq = new NodoArbol( valorInsertar );
            }else{
                nodoIzq.insertar( valorInsertar );
            }
        }else if (valorInsertar > datos){
            if ( nodoDer == null ){
                nodoDer = new NodoArbol( valorInsertar );
            }else{
                nodoDer.insertar( valorInsertar );
            }
        }
    }    
}
