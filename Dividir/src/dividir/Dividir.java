/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dividir;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Dividir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int aux;
        int c;
        int r;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número 1");
        n1=teclado.nextInt();
        System.out.println("Introduce un número 2");
        n2=teclado.nextInt();
        while (n1<=0 | n2<=0){
            System.out.println("Introduce un número 1");
            n1=teclado.nextInt();
            System.out.println("Introduce un número 2");
            n2=teclado.nextInt();
        }
        if (n1<n2){
            aux=n1;
            n1=n2;
            n2=aux;
        }
        c=Math.round(n1/n2);
        r=n1%n2;
        System.out.println(+c);
        System.out.println(+r);
    }
}
