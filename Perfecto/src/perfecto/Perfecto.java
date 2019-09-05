/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perfecto;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Perfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int a;
        int c;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número");
        n=teclado.nextInt();
        a=0;
        for (c=1; c<=n/2; c++){
            if (n%c==0){
                a=a+c;
            }
        }
        if (n==a){
                System.out.println("Número perfecto");
        }
        else{
            System.out.println("No es número perfecto");
        }
    }
}
