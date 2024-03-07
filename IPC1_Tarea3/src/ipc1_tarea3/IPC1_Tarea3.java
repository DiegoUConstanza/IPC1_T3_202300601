
package ipc1_tarea3;

import java.util.ArrayList;
import java.util.Scanner;

public class IPC1_Tarea3 {
    
    private static Boolean Seguir=true;
    private static final ArrayList<Integer> LongitudLado = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Opcion, Lado;
        do {
            System.out.println("------------------------------------");
            System.out.println("1. Triangulo (Solo triangulos equilateros)");
            System.out.println("2. Cuadrado");
            System.out.println("3. Decagono");
            System.out.println("4. Salir");
            System.out.println("Ingrese que figura quiere calcular");
            System.out.println("------------------------------------");
            Opcion = sc.nextInt();
            System.out.println("Por favor digite el valor entero del lado");
            
            switch(Opcion){
                case 1:
                    Lado = sc.nextInt();
                    LongitudLado.add(Lado);
                    Triangulo Triangulo = new Triangulo(Lado);
                    System.out.println("El area del Triangulo Equilatero con lado " + Lado + " es : " +  Triangulo.CalcularArea());
                    break;
                
                case 2:
                    Lado = sc.nextInt();
                    LongitudLado.add(Lado);
                    Cuadrado Cuadrado = new Cuadrado(Lado);
                    System.out.println("El area del Cuadrado con lado " + Lado + " es : " +  Cuadrado.CalcularArea());
                    break;
                    
                case 3:
                    Lado = sc.nextInt();
                    LongitudLado.add(Lado);
                    Decagono Decagono = new Decagono(Lado);
                    System.out.println("El area del Decagono con lado " + Lado + " es : " +  Decagono.CalcularArea());
                    break;
                
                case 4:
                    System.out.println("Vuelva pronto");
                    Seguir=false;
                    break;
            }
        } while (Seguir);
        System.out.println("____El siguiente listado muestra las longitudes de lados que ingreso____");
        for (int Lados : LongitudLado) {
            System.out.println(Lados);
        }
    }
}
