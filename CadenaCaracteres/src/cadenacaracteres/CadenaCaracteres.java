
package cadenacaracteres;

import java.util.Scanner;

public class CadenaCaracteres {

    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una frase");
      String frase=teclado.nextLine();
      primeroscaracteres(frase,5);
      ultimoscaracteres(frase,5);
      eliminarespaciofinal(frase);
      eliminarespaciocomenzo(frase);
      eliminarcaracteresposicion(frase,3,5);
      eliminarcadena(frase,"abc");
      insertarcadena(frase,"abc",5);
      sustituircadena(frase);
      contarcadena(frase);
      borrarcadena(frase);
    }
    public static void primeroscaracteres(String cadena, int n) {
        String texto=cadena.substring(0,n);
        System.out.println(texto);
    }
    
    public static void ultimoscaracteres(String cadena, int n) {
        String texto=cadena.substring(cadena.length()-n,cadena.length());
        System.out.println(texto);
    }
    
    public static void eliminarespaciofinal(String cadena){
        int i=cadena.length()-1;
        while (cadena.charAt(i)==' '){
            i--;
        }
        String texto=cadena.substring(0,i+1);
        System.out.println(texto);
    }
    
    public static void eliminarespaciocomenzo(String cadena){
        int i=0;
        while (cadena.charAt(i)==' '){
            i++;
        }
        String texto=cadena.substring(i);
        System.out.println(texto);
    }
    
    public static void eliminarcaracteresposicion(String cadena, int p, int f){
        String texto=cadena.substring(0,p)+cadena.substring(p+f);
        System.out.println(texto);
    }
    
    public static void eliminarcadena(String cadena, String palabra){
        String texto=cadena.replaceFirst(palabra, "");
        System.out.println(texto);
    }
    
    public static void insertarcadena(String cadena, String palabra, int p){
        String texto=cadena.substring(0,p)+palabra+cadena.substring(p);
        System.out.println(texto);
    }
    
    public static void sustituircadena(String cadena){
        String texto=cadena.replaceAll("que", "abc");
        System.out.println(texto);
    }
    
    public static void contarcadena(String cadena){
        
    }
    
    public static void borrarcadena(String cadena){
        String texto=cadena.replaceAll("que", "");
        System.out.println(texto);
    }
}
