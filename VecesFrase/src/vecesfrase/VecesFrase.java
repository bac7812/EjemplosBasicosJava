
package vecesfrase;

import java.util.Scanner;

public class VecesFrase {

    public static void main(String[] args) {
      String frase,subfrase;
      Scanner teclado=new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      frase=teclado.nextLine();
      System.out.println("Introduce otra cadena: ");
      subfrase=teclado.nextLine();
      veces(frase,subfrase);
    } 
    
    public static void veces(String frase,String subfrase) {
        int cont=0;
        int indice=frase.indexOf(subfrase);
        while (indice!=-1)
        {
            cont++;
            frase=frase.replaceFirst(subfrase, "");
            indice=frase.indexOf(subfrase);
        }
        System.out.println("Numero de veces de la subfrase dentro de la frase: "+cont);
    }
}
