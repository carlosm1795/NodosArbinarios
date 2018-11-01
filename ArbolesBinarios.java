
package arbolesbinarios;

import java.util.Random;


public class ArbolesBinarios {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();
        int valor;
        Random numeroAleatorio = new Random();
        System.out.println( "Insertando los siguientes valores: " );
        for ( int i = 1; i <= 10; i++ ){
            valor = numeroAleatorio.nextInt( 100 );
            System.out.print( valor + " " );
            arbol.insertarNodo( valor );
        }
        System.out.println ( "\n\nRecorrido preorden" );
        arbol.recorridoPreorden();
        
        System.out.println ( "\n\nRecorrido inorden" );
        arbol.recorridoInorden();
        
        System.out.println ( "\n\nRecorrido postorden" );
        arbol.recorridoPostorden();
        System.out.println();
    }
    
}
