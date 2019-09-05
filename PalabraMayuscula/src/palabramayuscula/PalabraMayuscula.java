
package palabramayuscula;

import java.util.Scanner;

public class PalabraMayuscula {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String frase=teclado.nextLine();
      palabramayúscula(frase);
    }
     public static void palabramayúscula(String cadena) {
        String palabra="";
        String nuevacadena="";
        do {
            if (cadena.indexOf(' ') == -1) {
                palabra=cadena;
                cadena="";
            }
            else{
                palabra=cadena.substring(0, cadena.indexOf(' '));
                cadena=cadena.substring(cadena.indexOf(' ') + 1, cadena.length());
            }
            
            nuevacadena+=palabra.substring(0,1).toUpperCase()+palabra.substring(1,palabra.length())+" ";
            
        } while (cadena!="");
        
      System.out.println(nuevacadena);
    }
}
