
package menufinal;

import java.util.Scanner;


public class CLASEMATRIZ {
    
     public void cargardatos (int arre[],int ca){
         
         
    Scanner entrada = new Scanner(System.in);
    arre = new int[ca];
    
   for(int i=0;i<ca;i++){
   System.out.print((i+1)+".digite un numero");
   arre[i] = entrada.nextInt();
      }    
    }
     
     
     
     
  public void mostrardatos (int arre[],int ca){
     System.out.println("\nArreglo ordenado en forma creciente:");                       
     for(int i=0;i<ca;i++){
     System.out.print(arre[i]+" - ");
     }     
    }
}

