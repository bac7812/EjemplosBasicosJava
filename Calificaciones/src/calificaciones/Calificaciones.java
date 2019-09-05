
package calificaciones;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        double ca;
        double cs;
        double nota;
        double ac;
        double m;
        double p;
        double media;
        ca=0;
        cs=0;
        ac=0;
        m=999;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("Introduce una nota");
            nota=teclado.nextInt();
            if (nota>=5) {
                ca++;
                ac+=nota;
            }
            if (nota<=5) {
                cs++;
            }
            if (nota<m){
                m=nota;
            }
        }
        while (nota!=0);
        p=cs/(cs+ca)*100;
        System.out.println("Porcentaje de suspensos "+p);
        media=ac/ca;
        System.out.println("Media de aprobados "+media);
        System.out.println("La nota más baja "+m);
        System.out.println("Número de aprobados "+ca);
    }
}
