package ui;

import data.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Debe crearse una clase UIText, esta será la encargada de
manejar la interfaz de usuario, además esta clase:
o Imprimirá y leerá datos que son enviados y/o solicitados por la clase de
negocio ShapeCalculatorTest.
o Tendrá todos sus métodos definidos como estáticos
o Debe ter un método encargado de la impresión del área y el perímetro de
la forma, este método debe tener la firma :
printShapeAreaPerimeter ( Shape )
o NOTA: Ninguna otra clase debe realizar la lectura o impresión de datos.
 */
public class UIText implements UI {

    private static Scanner reader = new Scanner(System.in);

    @Override
    public void printShapeAreaPerimeter(Shape shape) {
        System.out.println(shape.toString() + System.lineSeparator());
        System.out.println("Area= " + shape.getArea() + System.lineSeparator());
        System.out.println("Perimetro= " + shape.getPerimeter() + System.lineSeparator());
    }

    @Override
    public void Menu() {
        System.out.println("[------------- Calculadora Areas y perimetros ----------------]");
        System.out.println("|       Menu principal:                                       |");
        System.out.println("|       1.Calcular Area y perimetro de una figura guardada.   |");
        System.out.println("|       2.Añadir figura.                                      |");
        System.out.println("|       3.Eliminar figura.                                    |");
        System.out.println("|       4.Salir del programa.                                 |");
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("Seleccione una Opcion: ");

    }

    @Override
    public int figures(ArrayList<Shape> figure) {
        boolean ok = true;
        int j = 0;
        System.out.println("Figuras Actuales: " + System.lineSeparator());
        for (Shape shape : figure) {
            System.out.println("ID: " + figure.indexOf(shape) + System.lineSeparator() + shape.toString());
        }
        while (!reader.hasNextInt()) {
        reader.next();
        System.out.println("Sorry, that is an invalid input.");
        
    }
    return reader.nextInt();
    }

    @Override
    public int newfigure() {
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
        while (!reader.hasNextInt()) reader.next();
        int num2 = reader.nextInt();
        return num2;
    }

    @Override
    public int deletefigure(ArrayList<Shape> figure) {
        System.out.println("Que figura desea eliminar: ");
        for (Shape shape : figure) {
            System.out.println("ID: " + figure.indexOf(shape) + System.lineSeparator() + shape.toString());
        }
        while (!reader.hasNextInt()) reader.next();
        int num2 = reader.nextInt();
        return num2;
    }

    @Override
    public double newCircle() {
        System.out.println("Digite el valor del radio: ");
        while (!reader.hasNextDouble()) reader.next();
        double num2 = reader.nextDouble();
        return num2;
    }

    @Override
    public double newEquilateral() {
        double x;
        System.out.println("Digite el valor de la base: ");
        while (!reader.hasNextDouble()) reader.next();
        x = reader.nextDouble();
        return x;
    }

    @Override
    public double[] newIsoceles() {
        double[] x = new double[3];
        double xa;
        System.out.println("Digite el valor de la base: ");
        while (!reader.hasNextDouble()) reader.next();
        xa = reader.nextDouble();
        x[0] = xa;
        System.out.println("Digite el valor de los lados : ");
        while (!reader.hasNextDouble()) reader.next();
        xa = reader.nextDouble();
        x[1] = xa;
        x[2] = xa;
        return x;
    }

    @Override
    public double[] newScaleno() {
        double[] x = new double[3];
        System.out.println("Digite el punto A");
        while (!reader.hasNextDouble()) reader.next();
        x[0] = reader.nextDouble();
        System.out.println("Digite el punto B");
        while (!reader.hasNextDouble()) reader.next();
        x[1] = reader.nextDouble();
        System.out.println("Digite el punto C");
        while (!reader.hasNextDouble()) reader.next();
        x[2] = reader.nextDouble();
        return x;
    }

    @Override
    public double newSquare() {

        double x;
        System.out.println("Ingrese el valor de la arista: ");
        while (!reader.hasNextDouble()) reader.next();
        x = reader.nextDouble();
        return x;
    }

    @Override
    public double[] newRecatangle() {
        double[] x = new double[2];
        double xa;
        System.out.println("Ingrese el valor de la base: ");
        while (!reader.hasNextDouble()) reader.next();
        xa = reader.nextDouble();
        x[0] = xa;
        System.out.println("Ingrese el valor de la altura : ");
        while (!reader.hasNextDouble()) reader.next();
        xa = reader.nextDouble();
        x[1] = xa;
        return x;
    }

    @Override
    public double[] newTrapezoid() {
        double[] x = new double[5];
        System.out.println("Digite la base A");
        while (!reader.hasNextDouble()) reader.next();
        x[0] = reader.nextDouble();
        System.out.println("Digite la base B");
        while (!reader.hasNextDouble()) reader.next();
        x[1] = reader.nextDouble();
        System.out.println("Digite el lado A");
        while (!reader.hasNextDouble()) reader.next();
        x[2] = reader.nextDouble();
        System.out.println("Digite el lado B");
        while (!reader.hasNextDouble()) reader.next();
        x[3] = reader.nextDouble();
        System.out.println("Digite el angulo entre la base A y el lado A");
        while (!reader.hasNextDouble()) reader.next();
        x[4] = reader.nextDouble();
        return x;
    }

    @Override
    public void errorMsg() {
        System.out.println("Selecciona una opcion entre 1 y 9 porfavor.");
    }
}
