
package contarpalabras;

import java.util.Scanner;

public class ContarPalabras {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      palabras(frase);
    } 
    
    public static void palabras(String frase) {
        String [] destino;
        frase=frase.trim();
        destino=frase.split(" ");
        int cont=destino.length;
        System.out.println("Numero de palabras dentro de la frase: "+cont);
    }
}
