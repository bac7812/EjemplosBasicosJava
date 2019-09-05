
package palabrapalindromo;

import java.util.Scanner;

public class PalabraPalindromo {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String palabra=teclado.nextLine();
      invertir(palabra);
    }
    
    public static void invertir(String cadena) {
        String a=cadena;
        String invertido="";
        for(int i=a.length()-1; i>=0; i--){
        invertido+=a.charAt(i);
        }
        if (!a.equals(invertido)){
            System.out.println("No es palindromo");
        }
        else {
            System.out.println("Si es palindromo");
        }
    }
}
