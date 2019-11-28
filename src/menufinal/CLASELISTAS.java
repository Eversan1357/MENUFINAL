
package menufinal;

import menufinal.CLASELISTAS2.nodo;


public class CLASELISTAS {
    protected nodo inicio,fin;
    
    public CLASELISTAS(){
         inicio = null;
         fin = null;
    }
    
    public void agregaralincio(int elemento){
    inicio = new nodo (elemento, inicio);
    if(fin==null){
       fin = inicio;
      }
    }
    
    public void mostarlista(){
        nodo recorrer = inicio;
    }
    
    
}
