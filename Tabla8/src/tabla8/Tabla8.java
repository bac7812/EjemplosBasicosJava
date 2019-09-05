/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabla8;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Tabla8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int m;
        Scanner teclado=new Scanner(System.in);
        System.out.print("introduce un número");
        n=teclado.nextInt();
        for (int c=0; c<=10; c++)
            {m=n*c;
            System.out.println(n+"x"+c+"="+m);
            }
    }
    
}
