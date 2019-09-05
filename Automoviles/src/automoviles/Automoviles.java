
package automoviles;

import java.util.Scanner;

public class Automoviles {

    public static void main(String[] args) {
       int tarifa;
       int dias;
       int importebruto;
       int importedescuento;
       int importeneto;
       int lapices;
       int carmelos;
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduce un número de tarifa");
       tarifa=teclado.nextInt();
       System.out.println("Introduce un número de días");
       dias=teclado.nextInt();
       importebruto=tarifa*dias;
       importedescuento=(importebruto*15)/100;
       importeneto=importebruto-importedescuento;
       lapices=3*dias;
       carmelos=2*dias;
       System.out.println(lapices);
       System.out.println(carmelos);
       System.out.println(importeneto);
    }
}
