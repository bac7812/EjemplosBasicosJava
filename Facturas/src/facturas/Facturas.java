/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturas;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Facturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int c;
        int a;
        int cf;
        int codigo;
        int litros;
        int precio;
        int importe;
        cf=0;
        a=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número de veces");
        n=teclado.nextInt();
        for (c=1; c<=n; c++){
            System.out.println("Introduce un número de código");
            codigo=teclado.nextInt();
            System.out.println("Introduce un número de litros");
            litros=teclado.nextInt();
            System.out.println("Introduce un número de precio");
            precio=teclado.nextInt();
            importe=litros*precio;
            if (importe>=600){
                cf=cf+1;
            }
            a=a+importe;
        }
        System.out.println("Facturación "+a);
    }
    
}
