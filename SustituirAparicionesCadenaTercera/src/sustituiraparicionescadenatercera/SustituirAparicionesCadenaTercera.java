
package sustituiraparicionescadenatercera;

import java.util.Scanner;

public class SustituirAparicionesCadenaTercera {

    public static void main(String[] args) {
        String frase, cadena2, cadena3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        frase = teclado.nextLine();
        System.out.println("Introduce una segunda cadena");
        cadena2 = teclado.nextLine();
        System.out.println("Introduce una tercera cadena");
        cadena3 = teclado.nextLine();
        sustituciones(frase, cadena2, cadena3);
    }

    public static void sustituciones(String frase, String cad2, String cad3) {
        frase = frase.replaceAll(cad2, cad3);
        System.out.println("Cadena Final: " + frase);
    }
}