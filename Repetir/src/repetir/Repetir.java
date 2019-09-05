
package repetir;

import java.util.Scanner;

public class Repetir {

    public static void main(String[] args) {
      String frase;
      System.out.println("Introduce una cadena en Formato (NLNLNL...): ");
      Scanner teclado=new Scanner(System.in);
      frase=teclado.nextLine();
      repetircaracteres(frase);
    } 
    
    public static void repetircaracteres(String frase) {
        String destino="";
        frase=frase.trim();
        for (int i=0;i<frase.length();i=i+2) {
            for (int j=0;j<Integer.parseInt(String.valueOf(frase.charAt(i)));j++)
            destino=destino+String.valueOf(frase.charAt(i+1));
       }
        System.out.println(destino);
    }
}
