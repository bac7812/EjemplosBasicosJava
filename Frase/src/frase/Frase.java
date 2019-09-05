
package frase;

import java.util.Scanner;

public class Frase {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String frase=teclado.nextLine();
      palabramaslarga(frase);
    }
    public static void palabramaslarga(String cadena) {
        int maximalongitud=0;
        String palabramaslarga="";
        String palabra="";
        do {
            if (cadena.indexOf(' ') == -1) {
                palabra=cadena;
                cadena="";  
            }
            else{
                palabra=cadena.substring(0, cadena.indexOf(' '));
                cadena=cadena.substring(cadena.indexOf(' ') + 1, cadena.length());
            }
                if (maximalongitud<palabra.length()) {
                    maximalongitud=palabra.length();
                    palabramaslarga=palabra;
                }
        } while (cadena!="");
        
    System.out.println("La palabra es "+palabramaslarga+" y longitud es "+maximalongitud);
    }
}
