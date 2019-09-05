/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package descomponerlofactorial;

import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class DescomponerloFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int c;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        while (n!=1){
            c=2;
            while (n%c!=0){
                c=c+1;
            }
            System.out.println(+n+"|"+c);
            n=n/c;
        }
        System.out.println("1");
    }
}
