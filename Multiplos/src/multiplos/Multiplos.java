
package multiplos;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        int a;
        int b;
        int aux;
        int n;
        int ac;
        int i;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número a");
        a=teclado.nextInt();
        System.out.println("Introduce un número b");
        b=teclado.nextInt();
        while (a<=0 | b<=0){
            System.out.println("Introduce un número a");
            a=teclado.nextInt();
            System.out.println("Introduce un número b");
            b=teclado.nextInt();
        }
        if (a>b){
            aux=a;
            a=b;
            b=aux;
        }
        System.out.println("Introduce un número n");
        n=teclado.nextInt();
        if (a<=n & b>=n){
            ac=0;
            for (i=a; i<=b; i++){
                if(i%n==0){
                    ac=ac+i;
                }
            }
            System.out.println(+ac);
        }
    }
}
