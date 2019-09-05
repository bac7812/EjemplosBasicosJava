/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baliza;

import java.util.Scanner;

/**
 *
 * @author DAW111
 */
public class Baliza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int baliza;
        int valor;
        int mayor;
        int menor;
        int suma;
        int c;
        mayor=0;
        menor=0;
        suma=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número de baliza");
        baliza=teclado.nextInt();
        System.out.println("Introduce un número de valor");
        valor=teclado.nextInt();
        for (c=1; c<=valor; c++){
            if (baliza>c){
                menor=menor+1;
            }
            if (baliza<c){
                mayor=mayor+1;
                suma=suma+c;
            }
        }
        System.out.println("Los menores que baliza "+menor);
        System.out.println("Los mayores que baliza "+mayor);
        System.out.println("La suma de los mayores "+suma);
    }
}
