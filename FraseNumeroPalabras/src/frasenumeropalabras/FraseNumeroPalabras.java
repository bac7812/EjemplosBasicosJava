
package frasenumeropalabras;

import java.util.Scanner;

public class FraseNumeroPalabras {

    public static void main(String[] args) {
        String frase, cadena2, cadena3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        frase = teclado.nextLine();
        contpalabras1(frase);
        contpalabras2(frase);
    }

    public static void contpalabras1(String frase) {
        frase.trim();
        String[] palabras = frase.split(" ");
        System.out.println("Numero de palabras: " + palabras.length);
    }

    public static void contpalabras2(String frase) {
        frase.trim();
        String[] palabras = frase.split("\\ +");
        System.out.println("Numero de palabras: " + palabras.length);
    }
}