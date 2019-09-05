/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package floyd;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Floyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int c;
        int f;
        int e;
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        c=1;
        num=0;
        for (f=0; f<n; f++){
            System.out.println();
            for (e=0; e<c; e++){
                num=num+1;
                System.out.print(" "+num);
            }
            c=c+1;
        }
        System.out.println();
    }
}
