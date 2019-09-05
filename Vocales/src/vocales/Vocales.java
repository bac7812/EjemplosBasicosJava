
package vocales;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in,"ISO-8859-1");
        String frase=teclado.nextLine();
        int nv=Cuenta(frase);
        System.out.println("La frase: "+frase+" tiene "+nv+" vocales");
    }
    public static int Cuenta(String cadena){
        int contVocales=0;
        for(int i=0; i<cadena.length(); i++){
            System.out.println(cadena);
            int letra=cadena.charAt(i);
            switch (letra){
                case 'a':
                case 'A':
                case 'á':    
                case 'Á':
                    
                case 'e':
                case 'E':    
                case 'é':
                case 'É':
                    
                case 'i':
                case 'I':
                case 'í':
                case 'Í':
                    
                case 'o':
                case 'O':
                case 'ó':
                case 'Ó':
                    
                case 'u':
                case 'U':
                case 'ú':
                case 'Ú':
                    contVocales++;
            }
        }
        return contVocales;
    }
}
