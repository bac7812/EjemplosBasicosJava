
package consonantes;

import java.util.Scanner;

public class Consonantes {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String frase=teclado.nextLine();
        int nc=CuentaLetras(frase)-CuentaVocales(frase);
        System.out.println("La frase: "+frase+" tiene "+nc+" consonantes");
    }
    
     public static int CuentaVocales(String cadena){
        int contVocales=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='a' ||cadena.charAt(i)=='e' ||cadena.charAt(i)=='i' ||cadena.charAt(i)=='o' ||cadena.charAt(i)=='u'){
                contVocales++;
            }
        }
        return contVocales;
    }
     
    public static int CuentaLetras(String cadena){
        int contLetras=0;
        for(int i=0; i<cadena.length(); i++){
            char caracter=cadena.charAt(i);
            int ascii=(int) caracter;
            if ((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
                contLetras++;
        }
        return contLetras;
    }
}
