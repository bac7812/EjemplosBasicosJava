
package temperaturasemana;

import java.util.Scanner;

public class TemperaturaSemana {

    public static void main(String[] args) {
        int c;
        int mayor;
        int i;
        int f;
        int total;
        int media;
        mayor=0;
        total=0;
        for (i=1; i<=7; i++){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduce un número de temperatura Fº");
            f=teclado.nextInt();
            c=(f-32)*5/9;
            if (mayor<c){
                mayor=c;
            }
            total=c+c;
        }
        media=total/7;
        System.out.println(media);
        System.out.println(mayor);
    }
}
