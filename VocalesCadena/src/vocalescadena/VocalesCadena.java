
package vocalescadena;

import java.util.Scanner;

public class VocalesCadena {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String frase=teclado.nextLine();
        int nv=Cuenta(frase);
        System.out.println("La frase: "+frase+" tiene "+nv+" vocales");
    }
    public static int Cuenta(String cadena){
        int contVocales=0;
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='a' ||cadena.charAt(i)=='e' ||cadena.charAt(i)=='i' ||cadena.charAt(i)=='o' ||cadena.charAt(i)=='u'){
                contVocales++;
            }
        }
        return contVocales;
    }
}
