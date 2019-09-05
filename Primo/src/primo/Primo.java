/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primo;

import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int c;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número");
        n=teclado.nextInt();
        c=2;
        if (n!=2){
            while ((n%c)!=0 && c>n/2){
            c=c+1;
        }
            if ((n%c)==0){
                System.out.println("No es primo");
            }
            else{
                System.out.println("Es primo");
            }
        }
        else{
            System.out.println("Es primo");
        }
    }
}
