package menufinal;




import java.util.Scanner;
import javax.swing.JOptionPane;


public class MENUFINAL {

    public static void main(String[] args) {
      int OPCION = 0;
      int OPCION1 = 0;
      int OPCION2 = 0;
      int OPCION3 = 0;
      int OPCION4 = 0;
      int OPCION5 = 0;
      int OPCION6 = 0;
      int OPCION7 = 0;
      int OPCION4_1 = 0;
      int OPCION4_2 = 0;
     
      
      int numero1 = 0;
      int numero2 = 0;
      
      CLASEOPERACIONES obj = new CLASEOPERACIONES ();
      CLASEARREGLOS OBJ = new CLASEARREGLOS ();     
           
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
                do{ 
                   try{ 
                           OPCION1 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n 1.  SUMA"
                           + "\n 2.  RESTA"
                           + "\n 3.  MULTIPLICACION"
                           + "\n 4.  DIVISION"
                           + "\n 5.  SALIR"));
                    }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                    
                    switch(OPCION1){
                     case 1:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("la respuesta es :"+obj.suma(numero1,numero2));                       
                    break;
                     case 2:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("\n la respuesta es :"+obj.resta(numero1,numero2));
                    break;
                    case 3:    
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("\n la respuesta es :"+obj.multiplicar(numero1,numero2));
                    break;
                    case 4:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        System.out.print("\n la respuesta es :"+obj.dividir(numero1,numero2));
                    break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "ATRAS");
                    break;
                    default:
                     JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");   
                    break;   
                    }
                    
                }while(OPCION1 != 5);    
                
                    break;
                case 2:
                    do{ 
                      try{ 
                          OPCION2 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  CARGAR DATOS"
                           + "\n B.  MOSTRAR DATOS"
                           + "\n C.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(OPCION2){
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
                   }while(OPCION2 != 3);    
               
                    break;
                    
                case 3:
                JOptionPane.showMessageDialog(null, "MATRICES");
                do{ 
                      try{ 
                          OPCION3 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  CARGAR DATOS"
                           + "\n B.  MOSTRAR DATOS"
                           + "\n C.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(OPCION3){
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
                   }while(OPCION != 3);    
               
                    break;
                    
                case 4:
                JOptionPane.showMessageDialog(null, "ORDENAMINETOS");
                do{ 
                      try{ 
                          OPCION4 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  METODO BURBUJA"
                           + "\n B.  METODO SHELL"
                           + "\n C.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(OPCION4){
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
                   }while(OPCION4 != 3);    
               
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "LISTAS");
                     do{ 
                      try{ 
                          OPCION5 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATOS"
                           + "\n B.  MOSTAR LISTA"
                           + "\n C.  LIMPIAR LISTA"       
                           + "\n D.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(OPCION5){
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
                   }while(OPCION5 != 4);    
               
                    break;  
                case 6:
                    JOptionPane.showMessageDialog(null, "PILAS");
                    do{ 
                      try{ 
                          OPCION6 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATO"
                           + "\n B.  MOSTAR LA CIMA"
                           + "\n C.  SACAR DATO DE LA CIMA" 
                           + "\n D.  LIMPIAR LISTA"       
                           + "\n E.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(OPCION6){
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
                   }while(OPCION6 != 5);    
                    break;   
                    
                case 7:
                    JOptionPane.showMessageDialog(null, "COLAS");
                    do{ 
                      try{ 
                          OPCION7 = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n A.  INSERTAR DATO"
                           + "\n B.  MOSTAR DATO"
                           + "\n C.  SACAR DATO" 
                           + "\n D.  LIMPIAR COLA"       
                           + "\n E.  SALIR"));
                       }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                   switch(OPCION7){
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
                   }while(OPCION7 != 5);    
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
