
package premio;

import java.util.Scanner;

public class Premio {

    public static void main(String[] args) {
        int recaudacion;
        int aciertos;
        int acertantes;
        int premio;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número de recaudación");
        recaudacion=teclado.nextInt();
        System.out.println("Introduce un número de aciertos");
        aciertos=teclado.nextInt();
        System.out.println("Introduce un número de acertantes");
        acertantes=teclado.nextInt();
        while(acertantes<0){
            System.out.println("Introduce un número de acertantes");
            acertantes=teclado.nextInt();
        }
        if(aciertos==15){
            premio=(10*recaudacion)/acertantes;
            System.out.println(premio);
        }
        else {
            if(aciertos==14){
            premio=(12*recaudacion)/acertantes;
            System.out.println(premio);
            }
            else{
                if(aciertos==13){
                premio=(8*recaudacion)/acertantes;
                System.out.println(premio);
                }
                else{
                    if(aciertos==12){
                    premio=(8*recaudacion)/acertantes;
                    System.out.println(premio);
                    }
                    else{
                        if(aciertos==11){
                        premio=(8*recaudacion)/acertantes;
                        System.out.println(premio);
                        }
                        else{
                            if(aciertos==10){
                            premio=(9*recaudacion)/acertantes;
                            System.out.println(premio);
                            }
                            else{
                                System.out.println("No hay premio");
                            }
                        }
                    }
                }
            }
        }
    }
}
