package ui;

import data.*;
import java.util.Scanner;

/*Debe crearse una clase ShapeCalculatorUI, esta será la encargada de
manejar la interfaz de usuario, además esta clase:
o Imprimirá y leerá datos que son enviados y/o solicitados por la clase de
negocio ShapeCalculatorTest.
o Tendrá todos sus métodos definidos como estáticos
o Debe ter un método encargado de la impresión del área y el perímetro de
la forma, este método debe tener la firma :
printShapeAreaPerimeter ( Shape )
o NOTA: Ninguna otra clase debe realizar la lectura o impresión de datos.
*/

public class ShapeCalculatorUI {
    
    public static void printShapeAreaPerimeter(Shape shape){
        
        System.out.println(shape.toString() + "mi area es: ");
        shape.areaCalculation();
        System.out.println("y mi perimetro es: ");
        shape.perimeterCalculation();
        System.out.println();
    }
    
    public static void welcomeMsg(){
        System.out.println("Bienvenido");
        System.out.println("Calculadora de areas Ver 2.1.0 \n");
        System.out.println("Seleccione una opcion para los calculos:\n");
    }

    public static void optionsMenu(){
        System.out.println(" 1. Circulo");
        System.out.println(" 2. Semicirculo");
        System.out.println(" 3. Cuadrado");
        System.out.println(" 4. Rectangulo");
        System.out.println(" 5. Trapecio");
        System.out.println(" 6. Triangulo Equilatero");
        System.out.println(" 7. Triangulo Isoceles");
        System.out.println(" 8. Triangulo Escaleno");
        System.out.println(" 9. Salir del Programa\n");
        System.out.println(" Escriba una de las opciones:");
    }

    public static void errorMsg(){
        System.out.println("Selecciona una opcion entre 1 y 9 porfavor.");
    }
}
