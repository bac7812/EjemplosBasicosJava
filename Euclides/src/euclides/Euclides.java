
package euclides;

import java.util.Scanner;

public class Euclides {

    public static void main(String[] args) {
        int num1;
        int num2;
        int aux;
        int r;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce dos número");
        num1=teclado.nextInt();
        num2=teclado.nextInt();
        while(num1<num2){
            aux=num1;
            num1=num2;
            num2=aux;
        }
        r=1;
        while(r!=0){
            r=num1%num2;
            num1=num2;
            num2=r;
        }
        System.out.println(num1);
    }
    
}
