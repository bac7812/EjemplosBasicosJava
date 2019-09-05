
package numeropalabrasvocalesdiferentes;

import java.util.Scanner;

public class NumeroPalabrasVocalesDiferentes {

    public static void main(String[] args) {
        String frase, cadena2, cadena3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        frase = teclado.nextLine();
        contpalabrascon4vocales(frase);
    }

    public static void contpalabrascon4vocales(String frase) {
        frase = frase.trim();
        String[] palabras = frase.split(" ");
        int contvocales;
        for (int i = 0; i < palabras.length; i++) {
            contvocales = 0;
            if (palabras[i].toUpperCase().indexOf("A") != -1) {
                contvocales++;
            }
            if (palabras[i].toUpperCase().indexOf("E") != -1) {
                contvocales++;
            }
            if (palabras[i].toUpperCase().indexOf("I") != -1) {
                contvocales++;
            }
            if (palabras[i].toUpperCase().indexOf("O") != -1) {
                contvocales++;
            }
            if (palabras[i].toUpperCase().indexOf("U") != -1) {
                contvocales++;
            }
            if (contvocales >= 4) {
                System.out.println(palabras[i]);
            }
        }
    }
}