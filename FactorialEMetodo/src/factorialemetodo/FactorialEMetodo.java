
package factorialemetodo;

import java.util.Scanner;

public class FactorialEMetodo {

    public static void main(String[] args) {
        int terminos;
        int c;
        double e;
        double f;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        terminos=teclado.nextInt();
        e=1;
        for (c=1; c<=terminos; c++){
            f=factorial(c);
            e=e+1/f;
        }
        System.out.println(e);
    }
    public static long factorial (int n){
        long f=1;
        for (int a=1; a<=n; a++){
            f=f*a;
        }
        return f;
    }
}
