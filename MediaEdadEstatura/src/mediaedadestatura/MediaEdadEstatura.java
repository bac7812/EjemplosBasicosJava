/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediaedadestatura;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class MediaEdadEstatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int e;
        double a;
        int edad;
        double altura;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número de alumnos");
        n=teclado.nextInt();
        
        e=0;
        a=0;
        
        for (int c=1; c<=n; c++){
            System.out.println("Introduce un número de la edad");
            edad=teclado.nextInt();
            if (edad>=18){
                e=e+edad;
            }
            System.out.println("Introduce un número de la estatura");
            altura=teclado.nextDouble();
            if (altura>=1.75){ 
                a=a+altura;
            } 
        }
        
        edad=e/n;
        altura=a/n;
        
        System.out.println("La edad media es "+edad+" y la estatura media es "+altura);
    }
}
