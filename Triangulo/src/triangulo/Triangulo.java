/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulo;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int c;
        int f;
        int e;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        c=1;
        for (f=0; f<n; f++){
            System.out.println();
            for (e=0; e<n-f; e++){
                System.out.print(" ");
            }
            for (e=0; e<c; e++){
                System.out.print("*");
            }
            c=c+2;
        }
        System.out.println();
    }
}
