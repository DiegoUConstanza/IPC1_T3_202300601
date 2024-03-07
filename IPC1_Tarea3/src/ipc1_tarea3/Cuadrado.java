
package ipc1_tarea3;

public class Cuadrado extends Figura {

    //Hereda de Figura el tamanio del Lado de la figura para el cuadrado
    public Cuadrado(int Lado) {
        super(Lado);
    }

    
    //Un cuadrado es un poligono de 4 lados iguales
    @Override
    public double CalcularArea() {
        return Math.pow(Lado, 2);
    }
    
}
