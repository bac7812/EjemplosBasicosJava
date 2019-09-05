
package numeropositivonegativo;

import java.util.Scanner;

public class NumeroPositivoNegativo {

    public static void main(String[] args) {
        int cp;
        int cn;
        int n;
        cp=0;
        cn=0;
        while(true){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduce un número");
            n=teclado.nextInt();
            if(n==0)break;
            else if (n>0)cp++;
            else cn++;
        }
        System.out.println("El números positivos " +cp);
        System.out.println("El números negativos " +cn);
    }
}
