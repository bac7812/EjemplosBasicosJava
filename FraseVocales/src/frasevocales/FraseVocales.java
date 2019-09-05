
package frasevocales;

import java.util.Scanner;

public class FraseVocales {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce la frase");
      frase=teclado.nextLine();
      frasevocales(frase);
    } 
    
    public static void frasevocales(String frase){
        int contA=0;
        int contE=0;
        int contI=0;
        int contO=0;
        int contU=0;
        for(int i=0; i<frase.length(); i++){
            System.out.println(frase);
            int letra=frase.charAt(i);
            switch (letra){
                case 'a':
                case 'A':
                case 'á':    
                case 'Á':
                    contA++;
                case 'e':
                case 'E':    
                case 'é':
                case 'É':
                    contE++;
                case 'i':
                case 'I':
                case 'í':
                case 'Í':
                    contI++;
                case 'o':
                case 'O':
                case 'ó':
                case 'Ó':
                    contO++;
                case 'u':
                case 'U':
                case 'ú':
                case 'Ú':
                    contU++;
            }
        }
        System.out.println("Vocales A: "+contA);
        System.out.println("Vocales E: "+contE);
        System.out.println("Vocales I: "+contI);
        System.out.println("Vocales O: "+contO);
        System.out.println("Vocales U: "+contU);
    }
}
