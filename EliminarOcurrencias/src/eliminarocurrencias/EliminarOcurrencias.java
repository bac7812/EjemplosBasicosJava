
package eliminarocurrencias;

import java.util.Scanner;

public class EliminarOcurrencias {

    public static void main(String[] args) {
      String frase,subfrase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      System.out.println("Introduce otra cadena: ");
      subfrase=teclado.nextLine();
      eliminar(frase,subfrase);
    } 
    
    public static void eliminar(String frase,String subfrase) {
       frase=frase.replaceAll(subfrase,"");
       System.out.println("Resultado de la eliminacion de la subfrase: "+frase);
    }
}
