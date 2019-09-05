
package maximocomundivisor;

import java.util.Scanner;

public class Maximocomundivisor {

    public static void main(String[] args) {
        int num1;
        int num2;
        int divisor;
        int r1;
        int r2;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce dos números");
        num1=teclado.nextInt();
        num2=teclado.nextInt();
        divisor=48;
        r1=num1%divisor;
        r2=num2%divisor;
        while (r1!=0 || r2!=0){
            if (r1==0){
                if(r2==0){    
                }
                else{
                    divisor=divisor-1;
                    r1=num1%divisor;
                    r2=num2%divisor;
                }
            }
            else{
                divisor=divisor-1;
                r1=num1%divisor;
                r2=num2%divisor;
            }
        }
        System.out.println(divisor);
    }
}
