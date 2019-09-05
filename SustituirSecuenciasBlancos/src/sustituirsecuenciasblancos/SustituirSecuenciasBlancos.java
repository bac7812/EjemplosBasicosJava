
package sustituirsecuenciasblancos;

import java.util.Scanner;

public class SustituirSecuenciasBlancos {

    public static void main(String[] args) {
        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        frase = teclado.nextLine();
        dosblancosporuno(frase);
    }

    public static void dosblancosporuno(String frase) {
        frase = frase.replaceAll("  ", " ");
        System.out.println(" La cadena resultante es: " + frase);
    }
}