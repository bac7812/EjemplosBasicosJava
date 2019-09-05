/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numeromagico;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class NumeroMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intento;
        int num;
        int azar;
        intento=0;
        num=0;
        Random rnd = new Random ();
        azar=(int)(rnd.nextDouble () *50+1);
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 50");
        while ((intento<5) && (num!=azar)){
              num=teclado.nextInt();
              if (num==azar){
                System.out.println("Has acertado");
            }
            else {
                if (azar>num){
                    System.out.println("El número es mayor");
                }
                else {
                    System.out.println("El número es menor");
                }
            }
            intento=intento+1;
        }
        if (intento>=5){
            System.out.println("Has agotado los 5 intentos");
        }
    }
}
