package menufinal;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CLASEOPERACIONES {
    
     public int numero1;
    public int numero2;
    public double resultado;


    public int getnumero1() {
        return numero1;
    }

    public void setnumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getnumero2() {
        return numero2;
    }
    public int suma(int numero1,int numero2){

    int resp = 0;

    resp=numero1+numero2;

    return resp;
}

    public void setnumero2(int numero2) {
        this.numero2 = numero2;
    }
public int resta(int numero1,int numero2){

    int resp = 0;

    resp=numero1-numero2;
    
    return resp;
}

    public void setresultado(double resultado) {
        this.resultado = resultado;
    }

    public int Sumar(int numero1, int numero2){
        this.setnumero1(numero1);
        this.setnumero2(numero2); 
        return this.getnumero1()+this.getnumero2();
  }

   public int Restar(int num1, int num2){
         this.setnumero1(num1);
        this.setnumero2(num2); 
        return this.getnumero1()-this.getnumero2();
    }

   public int Multiplicar(int num1, int num2){
         this.setnumero1(num1);
        this.setnumero2(num2); 
        return this.getnumero1()*this.getnumero2();
    }

   public double Division(int num1, int num2){
         this.setnumero1(num1);
        this.setnumero2(num2); 
        return (double) getnumero1()/this.getnumero2();
    }  
public int multiplicar(int numero1,int numero2){

    int resp = 0;

    resp=numero1*numero2;

    return resp;
}

public int dividir(int numero1,int numero2){

    int resp = 0;

    resp=numero1/numero2;

    return resp;
}

        
   public void OPCION1(){
      String OPCION1;
       int numero1 ;
      int numero2 ;
      Scanner entrada = new Scanner(System.in);
       CLASEOPERACIONES obj = new CLASEOPERACIONES ();
       
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
                        int suma = numero1+numero2;  
                         System.out.println("la suama es :"+suma);
                    break;
                     case "B":
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        int resta = numero1-numero2;
                        System.out.println("la resta  es :"+resta);
                    break;
                    case "C":    
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        int multiplicacion = numero1*numero2;
                        System.out.println("la multiplicacion  es :"+multiplicacion);
                    break;
                    case "D":
                        numero1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del primer numero"));
                        numero2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del segundo numero"));
                        int division = numero1/numero2;
                        System.out.println("la suama es :"+division);
                    break;
                    case "E":
                        JOptionPane.showMessageDialog(null, "ATRAS");
                    break;
                     default:
                     JOptionPane.showMessageDialog(null, "!INGRESO UNA OPCION NO VALIDA¡");   
                     break;            
}      
 }
}