
package menufinal;

import javax.swing.JOptionPane;


public class MENUFINAL {

    public static void main(String[] args) {
      int op=0;
        int opcion=0;
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
       
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos");
          }
            switch(opcion){
                case 1:
                    obj.commit();
                   break; 
                case 2:
                    obj.push ();
                    break;
                case 3:
                    obj.pull();
                    break;
                case 4:
                    obj.clase();
                    break;
                case 5:
                    obj.objeto();
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
            }while(opcion != 13);
    }
    
}
        
        
        
        
        
        
        
        
    
    

