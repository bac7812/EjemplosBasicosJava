
package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        int num;
        int n;
        int i;
        int m;
        int a;
        int c;
        int r;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número de veces");
        num=teclado.nextInt();
        for (i=1; num>=i; i++){
            System.out.println("Introduce un número");
            n=teclado.nextInt();
            m=0;
            a=0;
            while (m!=n){
                m=0;
                c=n;
                while(c>0){
                    r=c%10;
                    m=m*10+r;
                    c=c/10;
                }
                if(m==n){
                }
                else{
                    a=a+1;
                    n=n+m;
                }
            }
            System.out.println(a+" "+m);
        }
    }
}
