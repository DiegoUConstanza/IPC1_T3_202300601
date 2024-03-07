
package ipc1_tarea3;

public class Decagono extends Figura {

    private int Perimetro;
    private double Apotema, Angulo;
    //Hereda de Figura el tamanio del Lado de la figura para el decagono
    public Decagono(int Lado) {
        super(Lado);
    }

    
    //Un decagono es un poligono de 10 lados iguales
    @Override
    public double CalcularArea() {
        Perimetro = Lado*10;
        Angulo = Math.toRadians(360/10);
        Apotema = Lado/(2*Math.tan(Angulo/2));
        return (Perimetro*Apotema)/2;
    }
    
    //Es posible hacerlo para que sea de cualquier cantidad de lados mayor o igual a 5
    // remplazando el 10 por una variable que tenga la cantidad de lados y asi obtener cualquier area
    
}
