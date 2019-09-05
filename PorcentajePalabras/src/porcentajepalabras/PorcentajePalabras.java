
package porcentajepalabras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PorcentajePalabras {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String frase=teclado.nextLine();
      porcentajepalabras(frase);
    }
     public static void porcentajepalabras(String cadena) {
        double cmenor=0;
        double cmayor=0;
        String palabra="";
        do {
            if (cadena.indexOf(' ') == -1) {
                palabra=cadena;
                cadena="";
            }
            else{
                palabra=cadena.substring(0, cadena.indexOf(' '));
                cadena=cadena.substring(cadena.indexOf(' ') + 1, cadena.length());
            }
            
            if(palabra.length()>=5){
                cmayor++;
             }
            else{
                cmenor++;
            }
            
        } while (cadena!="");
      
      double pmayor=cmayor/(cmenor+cmayor)*100;
      double pmenor=cmenor/(cmenor+cmayor)*100;
      
      DecimalFormat formato=new DecimalFormat("#0.00");
      
      System.out.println(formato.format(pmayor));
      System.out.println(formato.format(pmenor));
    }
}
