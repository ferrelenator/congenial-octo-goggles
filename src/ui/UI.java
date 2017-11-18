package ui;

import data.*;
import java.util.ArrayList;
import java.util.Scanner;

/*Debe crearse una clase UI, esta será la encargada de
manejar la interfaz de usuario, además esta clase:
o Imprimirá y leerá datos que son enviados y/o solicitados por la clase de
negocio ShapeCalculatorTest.
o Tendrá todos sus métodos definidos como estáticos
o Debe ter un método encargado de la impresión del área y el perímetro de
la forma, este método debe tener la firma :
printShapeAreaPerimeter ( Shape )
o NOTA: Ninguna otra clase debe realizar la lectura o impresión de datos.
*/

public class UI {
    
    private static Scanner reader = new Scanner(System.in);
    
    
    public static void printShapeAreaPerimeter(Shape shape){
        System.out.println(shape.toString()+ System.lineSeparator() );
        System.out.println("Area= "+ shape.getArea() +System.lineSeparator() );
        System.out.println("Perimetro= " + shape.getPerimeter() +System.lineSeparator());
    }
    public static int Menu(){
        System.out.println("[--- Calculadora Areas y perimetros ---]");
        System.out.println("|       Menu principal:                |");   
        System.out.println("|       1.Calcular Area y perimetro.   |");
        System.out.println("|       2.Añadir figura.               |");
        System.out.println("|       3.Eliminar figura.             |");
        System.out.println("|       4.Salir del programa.          |");
        System.out.println("----------------------------------------\n");
        System.out.println("Seleccione una Opcion: ");
        return reader.nextInt();
    }
    
    public static int figures(ArrayList<Shape> figure){
         System.out.println("Seleccione una figura para calcular el Area y el perimetro: "+System.lineSeparator());
        for (Shape shape : figure) {
            System.out.println("ID: "+figure.indexOf(shape)+System.lineSeparator()+shape.toString());
        }
        return reader.nextInt();
    }
    public static int newfigure(){
        System.out.println("Eliga una nueva figura");
        System.out.println(" 1. Circulo");
        System.out.println(" 2. Semicirculo");
        System.out.println(" 3. Cuadrado");
        System.out.println(" 4. Rectangulo");
        System.out.println(" 5. Trapecio");
        System.out.println(" 6. Triangulo Equilatero");
        System.out.println(" 7. Triangulo Isoceles");
        System.out.println(" 8. Triangulo Escaleno");
        System.out.println(" 9. Cancelar");
        return reader.nextInt();
    }
    
    public static int deletefigure(ArrayList<Shape> figure){
        System.out.println("Que figura desea eliminar: ");
        for (Shape shape : figure) {
            System.out.println("ID: "+figure.indexOf(shape)+System.lineSeparator()+shape.toString());
        }
        return reader.nextInt();
    }

    public static double newCircle(){
        System.out.println("Digite el valor del radio: ");
        return reader.nextDouble();
       }
    public static double newEquilateral(){
        double x;
        System.out.println("Digite el valor de la base: ");
        x=reader.nextDouble();
    return x;
    }
    public static double[] newIsoceles(){
        double[] x =new double[3];
        double xa;
        System.out.println("Digite el valor de la base: ");
        xa=reader.nextDouble();
        x[0]=xa;
        System.out.println("Digite el valor de los lados : ");
        xa=reader.nextDouble();
        x[1]=xa;x[2]=xa;
    return x;
}
    public static double[] newScaleno(){
        double[] x =new double[3];
        System.out.println("Digite el punto A");
        x[0]=reader.nextDouble();
        System.out.println("Digite el punto B");
        x[1]=reader.nextDouble();
        System.out.println("Digite el punto C");
        x[2]=reader.nextDouble();
    return x;
}
    public static double newSquare(){

        double x;
        System.out.println("Ingrese el valor de la arista: ");
        x=reader.nextDouble();    
    return x;
}
    public static double[] newRecatangle(){
        double[] x =new double[2];
        double xa;
        System.out.println("Ingrese el valor de la base: ");
        xa=reader.nextDouble();
        x[0]=xa;
        System.out.println("Ingrese el valor de la altura : ");
        xa=reader.nextDouble();
        x[1]=xa;   
    return x;
}
    public static double[] newTrapezoid(){
        double[] x =new double[5];
        System.out.println("Digite la base A");
        x[0]=reader.nextDouble();
        System.out.println("Digite la base B");
        x[1]=reader.nextDouble();
        System.out.println("Digite el lado A");
        x[2]=reader.nextDouble();
        System.out.println("Digite el lado B");
        x[3]=reader.nextDouble();
        System.out.println("Digite el angulo entre la base A y el lado A");
        x[4]=reader.nextDouble();          
    return x;   
}    
    public static void errorMsg(){
        System.out.println("Selecciona una opcion entre 1 y 9 porfavor.");
    }
}
