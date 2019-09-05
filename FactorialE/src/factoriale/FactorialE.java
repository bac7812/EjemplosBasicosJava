/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factoriale;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class FactorialE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        double e;
        int c;
        double f;
        int a;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        e=1;
        c=1;
        for (c=1; c<=n; c++){
            f=1;
            for (a=1; a<=c; a++){
                f=f*a;
            }
            e=e+1/f;
        }
        System.out.println(e);
    }
}
