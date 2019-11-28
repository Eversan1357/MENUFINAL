package menufinal;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MENUFINAL {

    public static void main(String[] args) {
      int OPCION = 0;
      String OPCION1;
      String OPCION2;
      String OPCION3;
      String OPCION4;
      String OPCION5;
      String OPCION6;
      String OPCION7;
      String OPCION4_1;
      String OPCION4_2;
     
      Scanner entrada = new Scanner(System.in);
      
      CLASEOPERACIONES obj = new CLASEOPERACIONES (); 
      CLASEARREGLO obl = new CLASEARREGLO();
      CLASEMATRIZ obk = new CLASEMATRIZ();
           
        do{  
          try{  
            
                OPCION = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
                    + "\n 1.  OPERACIONES"
                    + "\n 2.  ARREGLOS"
                    + "\n 3.  MATRICES"
                    + "\n 4.  ORDENAMIENTO"
                    + "\n 5.  LISTAS"
                    + "\n 6.  PILAS"
                    + "\n 7.  COLAS"
                    + "\n 8.  ARBOLES"
                    + "\n 9.  GRAFOS"
                    + "\n 10. SALIR"));
                
           }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
          
          
            switch(OPCION){
                case 1:        
                    obj.OPCION1();     
                   break;
                case 2:
                    obl.OPCION2();                 
                   break;                   
                case 3:
                       
                    break;
                    
                case 4:
                JOptionPane.showMessageDialog(null, "ORDENAMINETOS");             
                          JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  METODO BURBUJA"
                           + "\n B.  METODO SHELL"
                           + "\n C.  SALIR");  
                          
                          OPCION4= entrada.next();
                          
                   switch(OPCION4){
                        case "A":
                               JOptionPane.showInputDialog("elija la operacion"
                               + "\n a.  CARGAR DATOS"
                               + "\n b.  MOSTRAR DATOS"
                               + "\n c.  SALIR"); 
                          
                                OPCION4_1 = entrada.next();
                          
                                switch(OPCION4_1){
                                    case "a":                 
                                    break;
                                    case "b":  
                                    break;
                                    case "c":
                                   JOptionPane.showMessageDialog(null, "SALIR");
                                     break;
                                   default:
                                  JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                                    break;}      
                                    break;
                                    
                        case "B":
                            JOptionPane.showInputDialog("elija la operacion"
                               + "\n a.  CARGAR DATOS"
                               + "\n b.  MOSTRAR DATOS"
                               + "\n c.  SALIR"); 
                          
                                OPCION4_2 = entrada.next();
                          
                                switch(OPCION4_2){
                                    case "a":                 
                                    break;
                                    case "b":  
                                    break;
                                    case "c":
                                   JOptionPane.showMessageDialog(null, "SALIR");
                                     break;
                                   default:
                                  JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                                    break;}      
                            
                            
                        break;
                        
                        case "C": 
                            JOptionPane.showMessageDialog(null, "SALIR");
                        break;
                        
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;} 
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "LISTAS"); 
                          JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATOS"
                           + "\n B.  MOSTAR LISTA"
                           + "\n C.  LIMPIAR LISTA"       
                           + "\n D.  SALIR");
                          
                          OPCION5 = entrada.next();
                          
                   switch(OPCION5){
                        case "A":
                       
                            
                        break;
                        case "B":
                        break;
                        case "C":    
                        break;
                        case "D":    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;}                           
                    break;  
                case 6:
                    JOptionPane.showMessageDialog(null, "PILAS");
                          JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATO"
                           + "\n B.  MOSTAR LA CIMA"
                           + "\n C.  SACAR DATO DE LA CIMA" 
                           + "\n D.  LIMPIAR LISTA"       
                           + "\n E.  SALIR"); 
                          
                          OPCION6 = entrada.next();
                          
                   switch(OPCION6){
                        case "A":
                        break;
                        case "B":
                        break;
                        case "C":    
                        break;
                        case "D":    
                        break;
                        case "E":    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;}   
                    break;  
                    
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "COLAS");                   
                          JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATO"
                           + "\n B.  MOSTAR DATO"
                           + "\n C.  SACAR DATO" 
                           + "\n D.  LIMPIAR COLA"       
                           + "\n E.  SALIR");
                          
                          OPCION7 = entrada.next();
                          
                   switch(OPCION7){
                       
                        case "A":
                        break;
                        case "B":
                        break;
                        case "C":    
                        break;
                        case "D":    
                        break;
                        case "E":    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;}  
                    break; 
                    
                case 8:
                    JOptionPane.showMessageDialog(null, "ARBOLES");
                    break; 
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "GRAFOS");
                    break; 
                    
                case 10:
                    JOptionPane.showMessageDialog(null, "SALIR");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                   break;   
          }     
        }while(OPCION != 10);    
    }
   }


