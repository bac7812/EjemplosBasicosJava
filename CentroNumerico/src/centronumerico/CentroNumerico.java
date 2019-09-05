
package centronumerico;

import java.util.Scanner;

public class CentroNumerico {

    public static void main(String[] args) {
        int n;
        int i;
        int d;
        int si;
        int sd;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número");
        n=teclado.nextInt();
        i=1;
        d=n;
        si=i;
        sd=n;
        while (i<d){
            if(si<=sd){
                i=i+1;
                si=si+i;
            }
            else{
                if(sd<si){
                    d=d-1;
                    sd=sd+d;
                }
            }
        }
        if(sd==si){
            System.out.println("Es centro");
        }
        else{
            System.out.println("No es centro");
        }
    }
}
