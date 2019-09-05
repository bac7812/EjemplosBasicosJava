/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numeroinvierta;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class NumeroInvierta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int coc;
        int c;
        int a;
        int x;
        int r;
        int h;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        coc=n;
        c=0;
        while (coc>10) {
            c=c+1;
            coc=coc/10;
        }
        
        coc=n;
        a=0;
        
        for (x=c; x>=0; x--){
            r=coc%10;
            h=(int)(r*Math.pow(10,x));
            a=a+h;
            coc=coc/10;
        }
        System.out.println("El número " +n+ " invertido es " +a);
    }
}
