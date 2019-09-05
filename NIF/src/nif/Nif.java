
package nif;

import java.util.Scanner;

public class Nif {

    public static void main(String[] args) {
        boolean nifvalido=true;
             Scanner teclado=new Scanner(System.in);
         System.out.println("Introduce NIF");
         String nif=teclado.next();
         
        if (nif.length()!=9) 
            nifvalido=false;
        else {
            for (int i=0;i<=7;i++) {
               if (!java.lang.Character.isDigit(nif.charAt(i)))
               nifvalido=false;
            }
        
        if (!java.lang.Character.isLetter(nif.charAt(8)))
            nifvalido=false;
        }
        
        if (nifvalido==true)
           System.out.println("Parte del NIF de Digitos: "+nif.substring(0,8));
        else
           System.out.println("NIF incorrecto");
    }
}