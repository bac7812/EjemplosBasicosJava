
package sustituirespacioasterisco;

import java.util.Scanner;

public class SustituirEspacioAsterisco {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce la frase: ");
      frase=teclado.nextLine();
      sustituirespacioasterisco(frase);
    } 
    
    public static void sustituirespacioasterisco(String frase){
        String texto=frase.replaceAll(" ", "*");
        System.out.println(texto);
    }
}
