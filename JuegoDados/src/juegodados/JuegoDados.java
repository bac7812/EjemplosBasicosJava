/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegodados;
import java.util.Random;

/**
 *
 * @author DAW111
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int t;
        int t2;
        Random rand = new Random ();
        n1=1+rand.nextInt(6);
        n2=1+rand.nextInt(6);
        t=n1+n2;
        System.out.println(+t);
        if (t==7 || t==11){
            System.out.println("Gano");
        }
        if (t==2 || t==3 || t==12){
            System.out.println("Pierde");
        }
        if (t==4 || t==5 || t==6 || t==8 || t==9 || t==10){
            n1=1+rand.nextInt(6);
            n2=1+rand.nextInt(6);
            t2=n1+n2;
            while(t!=7 && t2!=t){
                n1=1+rand.nextInt(6);
                n2=1+rand.nextInt(6);
                t2=n1+n2;
            }
            if (t==7){
                System.out.println("Piere");
            }
            else{
                System.out.println("Gano");
            }
        }
    }
}
