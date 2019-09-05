/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posiivonegativo;

import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class PosiivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int aux;
        int i;
        int l;
        int c;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número");
        a=teclado.nextInt();
        b=teclado.nextInt();
        l=teclado.nextInt();
        if (a>b){
            aux=a;
            a=b;
            b=aux;
        }
        for (i=b; i>=a; i--){
            if (i%3==0){
                if (l>0){
                    System.out.println("- "+i);
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
