
package inicialesmayuscula;

import java.util.Scanner;

public class InicialesMayuscula {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      cambiariniciales(frase);
    } 
    
    public static void cambiariniciales(String frase) {
        frase=frase.trim();
        String [] destino=frase.split(" ");
        frase="";
        for (int i=0;i<destino.length;i++) {
          frase=frase+destino[i].replace(String.valueOf(destino[i].charAt(0)),String.valueOf(destino[i].charAt(0)).toUpperCase())+" ";
        }
        System.out.println("Frase resultado de cambiar las iniciales de la frase: "+frase.trim());
    }
}
