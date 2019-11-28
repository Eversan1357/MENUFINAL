
package menufinal;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class CLASEARREGLO {

public void OPCION2(){
    
    CLASEARREGLO obl = new CLASEARREGLO();
     Scanner entrada = new Scanner(System.in);
     String OPCION2;

JOptionPane.showInputDialog("elija la operacion"
    + "\n A.  CARGAR DATOS"
    + "\n B.  MOSTRAR DATOS"
    + "\n C.  SALIR");   
                          
      OPCION2 = entrada.next();
                          
                   switch(OPCION2){
                        case "A":                          
                         int arre[];
                         int ca;           
                         
                         ca = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elemtos"));
                         arre = new int[ca];  
                         
                        System.out.print("la respuesta es :");  
                                    
                       break;
                        case "B":
                                                 
                         ca = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elemtos"));
                         arre = new int[ca];
                         
                         System.out.print("la respuesta es :");                                                          
                        break;
                        case "c": 
                            JOptionPane.showMessageDialog(null, "SALIR");
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;}
}    
}
