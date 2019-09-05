/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dinero;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Dinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;
        int b;
        int r;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número");
        cantidad=teclado.nextInt();
        b=(int)(cantidad/100);
        r=cantidad%100;
        if (b>0){
            System.out.println("Billete de 100 "+b);
        }
        b=(int)(Math.sqrt(r/50));
        r=r%50;
        if (b>0){
            System.out.println("Billete de 50 "+b);
        }
        b=(int)(Math.sqrt(r/20));
        r=r%20;
        if (b>0){
            System.out.println("Billete de 20 "+b);
        }
        b=(int)(Math.sqrt(r/10));
        r=r%10;
        if (b>0){
            System.out.println("Billete de 10 "+b);
        }
        b=(int)(Math.sqrt(r/5));
        r=r%5;
        if (b>0){
            System.out.println("Billete de 5 "+b);
        }
        b=(int)(Math.sqrt(r/2));
        r=r%2;
        if (b>0){
            System.out.println("Billete de 2 "+b);
        }
        b=(int)(Math.sqrt(r/1));
        r=r%1;
        if (b>0){
            System.out.println("Billete de 1 "+b);
        }
    }
}
