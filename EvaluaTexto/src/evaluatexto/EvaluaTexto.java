
package evaluatexto;

import java.util.Scanner;

public class EvaluaTexto {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      evalua(frase);
    } 
    
    public static void evalua(String frase) {
       String nueva="";
       String mensaje="";
       int i;
       int cont=0;
       for (i=0; i<frase.length(); i++){
           nueva+=frase.charAt(i);
       }
       nueva=nueva.toLowerCase();
       for (char caracter='a'; caracter<='z'; caracter++){
           for (i=0; i<nueva.length(); i++){
               if(caracter==nueva.charAt(i)){
                   cont++;
               }
               if (cont==0){
                   mensaje+=caracter+" ";
               }
               cont=0;
           }
        System.out.println("Los caracteres que faltan son: "+mensaje);
       }
    }
}