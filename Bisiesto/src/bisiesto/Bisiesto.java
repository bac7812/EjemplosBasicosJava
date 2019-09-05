/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bisiesto;
import java.util.Scanner;

/**
 *
 * @author DAW107
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int r1;
        int r2;
        int r3;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        a=teclado.nextInt();
        while (a<=0){
            a=teclado.nextInt();
        }
        
        r1=a & 4;
        r2=a & 100;
        r3=a & 400;
                
        if (r1==0 && (r2!=0|| r3==0)){
            System.out.println("El año "+a+" es bisieto");
        }
        else {System.out.println("El año "+a+" no es bisieto");}
    }
}
