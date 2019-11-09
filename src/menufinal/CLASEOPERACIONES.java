package menufinal;

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

    public void setnumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public double getresultado() {
        return resultado;
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
}
