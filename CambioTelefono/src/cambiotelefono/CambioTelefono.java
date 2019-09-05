
package cambiotelefono;

import java.util.Scanner;

public class CambioTelefono {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      telefono(frase);
    } 
    
    public static void telefono(String frase) {
        frase=frase.trim();
        String nueva="("+frase.substring(0, 2)+")-"+frase.substring(2,3)+"-"+frase.substring(3,frase.length())+"12";
        System.out.println("Teléfono cambiado: "+nueva);
    }
}
