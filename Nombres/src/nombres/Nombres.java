
package nombres;

import java.util.Scanner;

public class Nombres {

    public static void main(String[] args) {
      String frase;
      System.out.println("Introduce un nombre completo: ");
      Scanner teclado=new Scanner(System.in);
      frase=teclado.nextLine();
      nombreyapellidos(frase);
    } 
    
    public static void nombreyapellidos(String frase) {
        String [] destino;
        frase.trim();
        destino=frase.split(" ");
        System.out.println("Primer apellido: "+destino[1]+"Segundo apellido: "+destino[2]+" Nombre: "+destino[0]);
    }
}
