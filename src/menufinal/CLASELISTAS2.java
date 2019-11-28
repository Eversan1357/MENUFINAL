
package menufinal;


public class CLASELISTAS2 {
    
  public class nodo {   
    public int dato;
    public nodo siguiente;//puntero de enlace
    //contructor para insertar al final 
    public nodo(int d)  {  
      this.dato=d;
    }
    //contructor para insertar al inicio
  public nodo(int d, nodo n){
      dato = d;
      siguiente = n;
   } 
  }
}
     

