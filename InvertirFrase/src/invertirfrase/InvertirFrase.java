
package invertirfrase;

import java.util.Scanner;

public class InvertirFrase {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String frase=teclado.nextLine();
      invertir(frase);
    }
    
    public static void invertir(String cadena) {
        String a=cadena;
        String invertido="";
        for(int i=a.length()-1; i>=0; i--){
        invertido+=a.charAt(i);
        }
    System.out.println("Palabra invertida: "+invertido);
    }
}

