
package fechas;

import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
      String frase;
      System.out.println("Introduce una fecha en formato (mm/dd/aa): ");
      Scanner teclado=new Scanner(System.in);
      frase=teclado.nextLine();
      formatofecha(frase);
    } 
    
    public static void formatofecha(String frase) {
        String [] destino;
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        frase=frase.trim();
        destino=frase.split("/");
        System.out.println(destino[0]+" de "+meses[Integer.parseInt(destino[1])-1]+" de 20"+destino[2]);
    }
}
