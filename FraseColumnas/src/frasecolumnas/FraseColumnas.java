
package frasecolumnas;

import java.util.Scanner;

public class FraseColumnas {

    public static void main(String[] args) {
        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el texto a evaluar");
        frase = teclado.nextLine();
        frasecolumnas(frase);
    }

    public static void frasecolumnas(String frase) {
        frase.trim();
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra:" + palabras[i] + " Longitud:" + palabras[i].length());
        }
    }
}
