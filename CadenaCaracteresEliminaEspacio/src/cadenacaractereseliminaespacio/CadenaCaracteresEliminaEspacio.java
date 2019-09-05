
package cadenacaractereseliminaespacio;

import java.util.Scanner;

public class CadenaCaracteresEliminaEspacio {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce la frase: ");
      frase=teclado.nextLine();
      cadenacaractereseliminaespacio(frase);
    } 
    
    public static void cadenacaractereseliminaespacio(String frase){
        String texto=frase.replaceAll(" ", "");
        System.out.println(texto);
    }
}
