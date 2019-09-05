
package peso;

import java.util.Scanner;

public class Peso {

    public static void main(String[] args) {
        int n;
        int mayorpeso;
        int pesototal;
        int c;
        int peso;
        int pesomedio;
        int procentaje;
        int personaspesototal;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número de personas");
        n=teclado.nextInt();
        mayorpeso=0;
        pesototal=0;
        personaspesototal=0;
        for (c=1; n>=c; c++){
            System.out.println("Introduce un número de peso");
            peso=teclado.nextInt();
            if (peso>=0 & peso<=200){
                mayorpeso=mayorpeso+peso;
                if (peso>=70.5){
                    pesototal=pesototal+peso;
                    personaspesototal=personaspesototal+1;
                }
            }
        }
        pesomedio=mayorpeso/n;
        procentaje=(80*n)/100;
        System.out.println("El total de personas que pesen más de 70.5 kg es " +personaspesototal);
        System.out.println("El mayor peso introducio es " +mayorpeso);
        System.out.println("El peso medio es " +pesomedio);
        System.out.println("El porcentaje de personas que están por debajo de 80 kg es " +procentaje);
    }
}
