
package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n;
        int f;
        f=1;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número entero");
        n=teclado.nextInt();
        if ((n==1) || (n==0)){
            System.out.println("El factorial es 1");
        }      
        else {
                for(int c=n; c>=1; c--)
                {f=f*c;
                } 
                System.out.println("El factorial es "+f);
            }
    }  
}
