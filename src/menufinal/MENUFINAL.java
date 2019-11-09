package menufinal;




import java.util.Scanner;
import javax.swing.JOptionPane;


public class MENUFINAL {

    public static void main(String[] args) {
     int op = 0;
      int op1 = 0;
      int op2 = 0;
      int op3 = 0;
      int op4 = 0;
      int op5 = 0;
      int op6 = 0;
      int op7 = 0;
      int op4_1 = 0;
      int op4_2 = 0;
      
      
      
      int sumar = 0;
      int numero1;
      int numero2;
      CLASEOPERACIONES obj = new CLASEOPERACIONES ();
                
           
        do{  
          try{  
            
                op = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
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
          
          
            switch(op){
                case 1: 
                do{ 
                   try{ 
                           op1 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n 1.  SUMA"
                           + "\n 2.  RESTA"
                           + "\n 3.  MULTIPLICACION"
                           + "\n 4.  DIVISION"
                           + "\n 5.  SALIR"));
                    }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                    
                    switch(op1){
                     case 1:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        
                    break;
                     case 2:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                    break;
                    case 3:    
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                    break;
                    case 4:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                    break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "ATRAS");
                    break;
                    default:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                   break;   
                    }
                    
                }while(op1 != 5);    
                
                    break;
                case 2:
                    do{ 
                      try{ 
                          op2 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  CARGAR DATOS"
                           + "\n B.  MOSTRAR DATOS"
                           + "\n C.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(op2){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;   
                     }
                   }while(op2 != 3);    
               
                    break;
                    
                case 3:
                JOptionPane.showMessageDialog(null, "MATRICES");
                do{ 
                      try{ 
                          op3 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  CARGAR DATOS"
                           + "\n B.  MOSTRAR DATOS"
                           + "\n C.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(op3){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;   
                     }
                   }while(op3 != 3);    
               
                    break;
                    
                case 4:
                JOptionPane.showMessageDialog(null, "ORDENAMINETOS");
                do{ 
                      try{ 
                          op4 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  METODO BURBUJA"
                           + "\n B.  METODO SHELL"
                           + "\n C.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(op4){
                        case 1:
                            JOptionPane.showMessageDialog(null, "LISTAS");
                    Scanner entrada = new Scanner(System.in);
                    int arreglo[],nElementos;
                    int aux;
        
                    nElementos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elemtos"));
        
                    arreglo = new int[nElementos];
        
                   for(int i=0;i<nElementos;i++){
                    System.out.print((i+1)+".digite un numero");
                    arreglo[i] = entrada.nextInt();
                    }
        
                    for(int i=0;i<(nElementos-1);i++){
                     for(int j=0;j<(nElementos-1);j++){
                      if(arreglo[j] > arreglo[j+1]){
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;  
                        }
                       }
                      }
        
                      System.out.println("\nArreglo ordenado en forma creciente:");
                     for(int i=0;i<nElementos;i++){
                      System.out.print(arreglo[i]+" - ");
                      }
                        break;
                        case 2:
                        break;
                        case 3:    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;   
                     }
                   }while(op4 != 3);    
               
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "LISTAS");
                     do{ 
                      try{ 
                          op5 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATOS"
                           + "\n B.  MOSTAR LISTA"
                           + "\n C.  LIMPIAR LISTA"       
                           + "\n D.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(op5){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:    
                        break;
                        case 4:    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;   
                     }
                   }while(op5 != 4);    
               
                    break;  
                case 6:
                    JOptionPane.showMessageDialog(null, "PILAS");
                    do{ 
                      try{ 
                          op6 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATO"
                           + "\n B.  MOSTAR LA CIMA"
                           + "\n C.  SACAR DATO DE LA CIMA" 
                           + "\n D.  LIMPIAR LISTA"       
                           + "\n E.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(op6){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:    
                        break;
                        case 4:    
                        break;
                        case 5:    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;   
                     }
                   }while(op6 != 5);    
                    break;   
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "COLAS");
                    do{ 
                      try{ 
                          op7 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATO"
                           + "\n B.  MOSTAR DATO"
                           + "\n C.  SACAR DATO" 
                           + "\n D.  LIMPIAR COLA"       
                           + "\n E.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(op7){
                        case 1:
                        break;
                        case 2:
                        break;
                        case 3:    
                        break;
                        case 4:    
                        break;
                        case 5:    
                        break;
                       default:
                        JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");
                        break;   
                     }
                   }while(op7 != 5);    
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
        }while(op != 10);    
    }
}
