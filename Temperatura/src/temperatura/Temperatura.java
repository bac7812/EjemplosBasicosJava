
package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        double f;
        double c;
        f=0;
        c=0;
        do{
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduce un número");
            f=teclado.nextInt();
        }
        while(f!=999);
        c=(f-32)*5/9;
        System.out.println(c);
    }
}