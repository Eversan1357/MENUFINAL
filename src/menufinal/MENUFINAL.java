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
     
      
      int numero1 ;
      int numero2 ;
     
      Scanner entrada = new Scanner(System.in);
      
      

      
      CLASEOPERACIONES obj = new CLASEOPERACIONES (); 
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
                           JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  SUMA"
                           + "\n B.  RESTA"
                           + "\n C.  MULTIPLICACION"
                           + "\n D.  DIVISION"
                           + "\n E.  SALIR");
                           
                          OPCION1 = entrada.next();
                        
                    switch(OPCION1){
                     case "A":
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("la respuesta es :"+obj.suma(numero1,numero2));                       
                    break;
                     case "B":
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("\n la respuesta es :"+obj.resta(numero1,numero2));
                    break;
                    case "C":    
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("\n la respuesta es :"+obj.multiplicar(numero1,numero2));
                    break;
                    case "D":
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("\n la respuesta es :"+obj.dividir(numero1,numero2));
                    break;
                    case "E":
                        JOptionPane.showMessageDialog(null, "ATRAS");
                    break;
                     default:
                     JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");   
                     break;}
                   break;
                case 2:
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
                         0
                         System.out.print("la respuesta es :"+obk.cargardatos);  
                                    
                       break;
                        case "B":
                                                 
                         ca = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elemtos"));
                         arre = new int[ca];
                         
                         System.out.print("la respuesta es :"+obk.mostraratos);   
                            
                            
                        break;
                        case "c": 
                            JOptionPane.showMessageDialog(null, "SALIR");
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;}              
                   break;
                    
                case 3:
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


