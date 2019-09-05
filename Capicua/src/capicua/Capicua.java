
package capicua;

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        int n;
        int m;
        int c;
        int contd;
        int r;
        int s;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        m=0;
        c=n;
        contd=0;
        s=0;
        while (c>0){
            r=c%10;
            m=m*10+r;
            c=c/10;
            contd++;
            s=s+r;
        }
        System.out.println(m);
        System.out.println(contd);
        System.out.println(s);
        if (n==m){
            System.out.println("Es capicua");
        }
        else {
            System.out.println("No es capicua");
        }
    } 
}
