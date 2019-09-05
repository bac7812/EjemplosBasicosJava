
package palabraalreves;


import java.util.Scanner;

import java.util.*;

public class PalabraalReves {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena=teclado.next();
        String cadenareves=new String();
        
        for (int i=cadena.length()-1;i>=0;i--) {
            char c=(cadena.charAt(i));
            String cad=c+"";      
            cadenareves=cadenareves.concat(cad);
        }
        System.out.println("Resultado : "+cadenareves);
    }
}
