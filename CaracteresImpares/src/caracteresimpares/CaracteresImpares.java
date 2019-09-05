
package caracteresimpares;

import java.util.Scanner;

public class CaracteresImpares {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String frase=teclado.nextLine();
      impares(frase);
    } 
    
    public static void impares(String frase) {
        String destino="";
        for (int i=0;i<frase.length();i++) {
            if (i%2!=0) destino=destino+String.valueOf(frase.charAt(i)); 
        }
        System.out.println(" Posiciones Impares de: "+frase+"son: "+destino);
    }
}
