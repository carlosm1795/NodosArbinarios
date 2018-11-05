
package arbolesbinarios;

import java.util.Random;


public class ArbolesBinarios {

  
    public static void main(String[] args) {
        // TODO code application logic here
        //    6
        //   / \
        //  2   8
        // /\   /\
        //1  4 7 9
        //  /\    \
        // 3  5    10
        
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
        arbol.insertarNodo(7);
        arbol.insertarNodo(9);
        arbol.insertarNodo(10);
        System.out.println("");
        //System.out.println ( "\n\nRecorrido preorden" );
        //arbol.recorridoPreorden();
        
        //System.out.println ( "\n\nRecorrido inorden" );
        arbol.recorridoInorden();

        System.out.println("");
        arbol.eliminarNodo(9);
        
        arbol.recorridoInorden();

    }
    
}
