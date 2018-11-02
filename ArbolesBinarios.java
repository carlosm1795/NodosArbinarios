
package arbolesbinarios;

import java.util.Random;


public class ArbolesBinarios {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();
        int valor;
        Random numeroAleatorio = new Random();
        int valoresAInsertar = 10;
        System.out.println( "Insertando los siguientes valores: " );
        /*for ( int i = 1; i <= valoresAInsertar; i++ ){
            valor = numeroAleatorio.nextInt( 11 );
            System.out.print( valor + " " );
            arbol.insertarNodo( valor );
        }*/
        arbol.insertarNodo(6);
        arbol.insertarNodo(2);
        arbol.insertarNodo(1);
        arbol.insertarNodo(4);
        arbol.insertarNodo(3);
        arbol.insertarNodo(5);
        arbol.insertarNodo(8);
        arbol.insertarNodo(10);
        System.out.println("");
        //System.out.println ( "\n\nRecorrido preorden" );
        //arbol.recorridoPreorden();
        
        //System.out.println ( "\n\nRecorrido inorden" );
        arbol.recorridoInorden();
        
        //System.out.println ( "\n\nRecorrido postorden" );
        //arbol.recorridoPostorden();
        //System.out.println();
        
        //arbol.verificarNodo(valoresAInsertar);
        arbol.search();
        //arbol.eliminarNodo(8);
        
        
        //arbol.recorridoInorden();
        //arbol.mostrarNodoEncontrado(2);
        arbol.infoParaEliminar(4);
    }
    
}
