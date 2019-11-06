
package menufinal;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MENUFINAL {

    public static void main(String[] args) {
      int op = 0;
      int opcion = 0;
      int sumar = 0;
      int numero1;
      int numero2;
      CLASEMENU obj = new CLASEMENU ();
                
           
        do{  
          try{  
            
                opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
                    + "\n 1.  OPERACIONES"
                    + "\n 2.  ARREGLOS"
                    + "\n 3.  MATRICES"
                    + "\n 4.  RECURSIVIDAD"
                    + "\n 5.  ORDENAMIENTO BURBUJA"
                    + "\n 6.  ORDENAMIENTO SHELL"
                    + "\n 7.  LISTAS"
                    + "\n 8.  PILAS"
                    + "\n 9.  COLAS"
                    + "\n 10. ARBOLES"
                    + "\n 11. GRAFOS"
                    + "\n 12. SALIR"));
           }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
          
          
            switch(opcion){
                case 1: 
                do{ 
                   try{ 
                           op = Integer.parseInt(JOptionPane.showInputDialog("elija la operacion"
                           + "\n 1.  SUMA"
                           + "\n 2.  RESTA"
                           + "\n 3.  MULTIPLICACION"
                           + "\n 4.  DIVISION"
                           + "\n 5.  SALIR"));
                    }catch(Exception ex){JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos"); }
                    
                    
                    switch(op){
                     case 1:
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        
                    break;
                     case 2:
                     JOptionPane.showMessageDialog(null, "DS");
                    break;
                    case 3:    
                     JOptionPane.showMessageDialog(null, "DS");
                    break;
                    case 4:
                     JOptionPane.showMessageDialog(null, "DS");
                    break;
                    case 5:
                     JOptionPane.showMessageDialog(null, "DS");
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                   break;   
                    }
                    
                }while(opcion != 5);    
                
                    break;
                case 2:
                
                   JOptionPane.showMessageDialog(null, "DS");
                    break;
                case 3:
                JOptionPane.showMessageDialog(null, "DS");
                    break;
                case 4:
                JOptionPane.showMessageDialog(null, "DS");
                    break;
                case 5:
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
                case 6:
                    JOptionPane.showMessageDialog(null, "DS");
                    break;    
                case 7:
                    JOptionPane.showMessageDialog(null, "DF");
                    break;   
                case 8:
                    JOptionPane.showMessageDialog(null, "DF");
                    break;    
                case 9:
                    JOptionPane.showMessageDialog(null, "DF");
                    break; 
                case 10:
                    JOptionPane.showMessageDialog(null, "DF");
                    break; 
                case 11:
                    JOptionPane.showMessageDialog(null, "DF");
                    break;  
                case 12:
                    JOptionPane.showMessageDialog(null, "DF");
                    break;  
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                   break;   
          }     
        }while(opcion != 12);
    }
}
