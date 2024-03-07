
package ipc1_tarea3;

public class Triangulo extends Figura{

    private double Semiperimetro, S;
    
    //Hereda de Figura el tamanio del Lado de la figura para el triangulo
    public Triangulo(int Lado) {
        super(Lado);
    }

    
    //Un triangulo es un poligono de 3 lados, en este programa solo se realizaran triangulo equlateros
    @Override
    public double CalcularArea() {
        //El area fue a base de la formula de Heron
        Semiperimetro = (Lado*3)/2;
        return Math.sqrt(Semiperimetro * (Semiperimetro - Lado) * (Semiperimetro - Lado) * (Semiperimetro - Lado));
     }
    
}
