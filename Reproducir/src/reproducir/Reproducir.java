
package reproducir;

import java.util.Scanner;

public class Reproducir {

    public static void main(String[] args) {
      String frase;
      int n;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      System.out.println("Introduce un numero: ");
      n=teclado.nextInt();
      multiplicar(frase,n);
    } 
    
    public static void multiplicar(String frase,int num) {
     
       String destino="";
       for (int i=0;i<num;i++) {
           
          destino=destino+frase+" ";
       }
       destino=destino.trim();
       System.out.println("Cadena multiplicada: "+destino);
    }
}
