
package construirfuncionsubcadena;

import java.util.Scanner;

public class ConstruirFuncionSubcadena {

    public static void main(String[] args) {
        String frase, subfrase;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        frase = teclado.nextLine();
        System.out.println("Introduce otra cadena");
        subfrase = teclado.nextLine();
        System.out.println("Introduce posicion a partir de");
        int pos = teclado.nextInt();
        encontrarapartirposicion(frase, subfrase, pos);
    }

    public static void encontrarapartirposicion(String frase, String subfrase, int pos) {
        int i, j, k;
        int op = frase.indexOf(subfrase, pos);;
        if (op < 0) {
            System.out.println(" La subcadena no se encuenta en la cadena a partir de la pos: " + pos);
        } else {
            System.out.println(" La subcadena se encuenta en la cadena a partir de la pos: " + pos + " en la pos: " + op);
        }
    }
}
