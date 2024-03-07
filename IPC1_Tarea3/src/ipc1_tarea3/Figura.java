
package ipc1_tarea3;

//Creamos la clase Abstracta FIgura que contiene el atributo Lados
abstract class Figura {
    
    protected int Lado;
    
    public Figura(int Lado){
        this.Lado = Lado;
    }
    
    //Se define el metodo abstracto Calcular Lado
    public abstract double CalcularArea();      
    
}
