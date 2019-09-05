
package intercalar;

import java.util.Scanner;

public class Intercalar {

    public static void main(String[] args) {
      String frase,subfrase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      System.out.println("Introduce otra cadena: ");
      subfrase=teclado.nextLine();
      intercalarcaracteres(frase,subfrase);
    } 
    
    public static void intercalarcaracteres(String frase,String subfrase) {
       int i,j,k;
       String destino="";
       for (i=0,j=0,k=0;i<frase.length()+subfrase.length();i++) {
           if (j<frase.length()) {
               destino=destino+String.valueOf(frase.charAt(j));
               j++;
           }
            if (k<subfrase.length()) {
               destino=destino+String.valueOf(subfrase.charAt(k));
               k++;
           }
       }
       System.out.println("Frases intercaladas: "+destino);
    }
}