/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecuacionsegundogrado;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class EcuacionSegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double r;
        double x1;
        double x2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entero");
        a=teclado.nextDouble();
        b=teclado.nextDouble();
        c=teclado.nextDouble();
        if (a!=0) {
            r=b*b-4*a*c;
            if (r>=0){
                x1=(-b+Math.sqrt(r))/(2*a);
                x2=(-b-Math.sqrt(r))/(2*a);
                System.out.println("Solución 1 " +x1);
                System.out.println("Solución 2 " +x2);
            }
            else {
                System.out.println("No tiene solución real");
            }
        }
        else {
            System.out.println("No es una ecuación de segundo grado");
        }
    }
}
