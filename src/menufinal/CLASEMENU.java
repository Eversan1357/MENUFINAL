
package menufinal;

import javax.swing.JOptionPane;

public class CLASEMENU {
    
    private int id;
    private String fecha;
    private String nombre;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void commit(){
        JOptionPane.showMessageDialog(null, " hacer un commit se refiere, en el contexto de la ciencia de la \n  computación y la gestión de datos, a la idea de confirmar un conjunto de cambios provisionales de forma \n permanente. Un uso popular es al final de una transacción de base de datos.");
    }
    
    public void push(){
        JOptionPane.showMessageDialog(null, "  Esta operación toma como argumento un registro general, de \n segmento o una posición de memoria y la introduce (copia) al Stack.");
    }
    
    public void pull(){
        JOptionPane.showMessageDialog(null, "Los pull request permiten no solo llevar de forma más ordenada las \n tareas en la etapa del desarrollo, sino también crear propuestas o cambios que puedan \n ser integrados posteriormente a dicho proyecto.");
    }
    
    public void clase(){
        JOptionPane.showMessageDialog(null, "una clase es una plantilla para la creación de objetos de datos según \n un modelo predefinido. Las clases se utilizan para representar entidades o conceptos,\n como los sustantivos en el lenguaje. Cada clase es un modelo que define un conjunto\n de variables -el estado, y métodos apropiados para operar con dichos datos -el comportamiento. Cada objeto creado a \n partir de la clase se denomina instancia de la clase.");
    }
    
    public void objeto(){
        JOptionPane.showMessageDialog(null, "un objeto es una unidad dentro de un programa de computadores \n que consta de un estado y de un comportamiento, que a su vez constan respectivamente \n  de datos almacenados y de tareas realizables durante el tiempo de ejecución. Un objeto \n puede ser creado instanciando una clase, como ocurre en la programación orientada a objetos, o mediante escritura directa de código y la replicación de \n otros objetos, como ocurre en la programación basada en prototipos.");
    }
}

    
    
    
    
    
    
    
    
    
    
    

