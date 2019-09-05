
package histograma;

import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
      String frase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce el texto a evaluar: ");
      frase=teclado.nextLine();
      histograma(frase);
    } 
    
    public static void histograma(String frase) {
       int i;
       int c1=0, c2=0, c3=0, c4=0, c5=0;
       String m1="", m2="", m3="", m4="", m5="";
       frase=frase.toLowerCase();
       for(i=0;i<frase.length();i++){
          if(frase.charAt(i)=='a'){
              c1++;
              m1+="*";
          }
          if(frase.charAt(i)=='e'){
              c2++;
              m2+="*";
          }
          if(frase.charAt(i)=='i'){
              c3++;
              m3+="*";
          }
          if(frase.charAt(i)=='o'){
              c4++;
              m4+="*";
          }
          if(frase.charAt(i)=='u'){
              c5++;
              m5+="*";
          }
       }
       System.out.println("");
       System.out.println("a"+"    "+c1+"    "+m1);
       System.out.println("e"+"    "+c2+"    "+m2);
       System.out.println("i"+"    "+c3+"    "+m3);
       System.out.println("o"+"    "+c4+"    "+m4);
       System.out.println("u"+"    "+c5+"    "+m5);
    }
}
