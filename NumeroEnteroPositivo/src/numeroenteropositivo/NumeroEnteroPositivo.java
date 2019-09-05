
package numeroenteropositivo;

import java.util.Scanner;

public class NumeroEnteroPositivo {

    public static void main(String[] args) {
        int n;
        int s;
        int c;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        s=0;
        c=0;
        while(n<=0){
            System.out.println("Introduce un número");
            n=teclado.nextInt();
        }
        while(s<=n){
            c=c+1;
            s=s+(int)Math.pow(c,2);
        }
        System.out.println(c);
        System.out.println(s);
    }
}