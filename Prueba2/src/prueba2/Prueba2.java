
package prueba2;

import java.util.Scanner;

public class Prueba2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce dos números");
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
        int s=sumaNumeros(num1,num2);
        System.out.println("La suma es "+s);
    }
    public static int sumaNumeros (int num1, int num2){
        int suma=num1+num2;
        return suma;
    }
}
