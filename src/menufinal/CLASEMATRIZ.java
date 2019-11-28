
package menufinal;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class CLASEMATRIZ {
    
     public void OPCION3 (){
         
         CLASEMATRIZ obk = new CLASEMATRIZ();
         Scanner entrada = new Scanner(System.in);
         String OPCION3;
      
         JOptionPane.showMessageDialog(null, "MATRICES"); 
                          JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  CARGAR DATOS"
                           + "\n B.  MOSTRAR DATOS"
                           + "\n C.  SALIR"); 
                          
                          OPCION3 = entrada.next();
                          
                   switch(OPCION3){
                        case "A":
                            int matriz [][];
                            int nf,nc;
                            
                            nf = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas :"));
                            nc = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas:"));
                            matriz = new int [nf][nc];
                            
                            System.out.println("Digitela matriz");
                            
                            for(int y=0; y<nf;y++){ 
                               for(int k=0; k<nc;k++){ 
                                   System.out.print("Matriz["+y+"]["+k+"] : ");
                                   matriz[y][k] = entrada.nextInt();
                                }                                        
                            }  
                            
                            System.out.println("\n La matriz es : ");
                            for(int y=0; y<nf;y++){ 
                               for(int k=0; k<nc;k++){ 
                                   System.out.print(matriz[y][k]);
                                   matriz[y][k] = entrada.nextInt();
                                } 
                                System.out.println("");
                            }           
                        break;
                        case "D":  
                        break;
                        case "c":
                            JOptionPane.showMessageDialog(null, "SALIR");
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;} 
         
   
    }
}

