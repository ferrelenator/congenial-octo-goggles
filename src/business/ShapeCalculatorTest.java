package business;
import data.*;
import java.*;
import ui.ShapeCalculatorUI;
import java.util.Scanner;

/*Debe crearse una clase ShapeCalculatorTest, esta será la encargada de
manejar la lógica de negocio, además esta clase:
o Manejará el flujo del programa.
o Se comunicará con la clase de la interfaz de usuario para realizar las tareas
de impresión y lectura de datos.
o Tendrá todos sus métodos definidos como estáticos.
o NOTA: Ninguna otra clase debe instanciar alguna forma.
• La asignación de los valores de los atributos de las formas debe realizarse a
través de los constructores de las clases al momento de crear la instancia.
*/

public class ShapeCalculatorTest {
    public static void main(String[] args) {
        ui.ShapeCalculatorUI.welcomeMsg();
        
        Scanner mainSN = new Scanner(System.in);
        boolean salida = false;
        int opcion;
        
        while(!salida){
                ui.ShapeCalculatorUI.optionsMenu();
                opcion = mainSN.nextInt();
                switch(opcion){
                    case 1:
                        Scanner scanner = new Scanner(System.in);
                        Circle circle = new Circle(scanner);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(circle);
                        break;
                    case 2:
                        Scanner scanner2 = new Scanner(System.in);
                        Semicircle semicircle = new Semicircle(scanner2);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(semicircle);
                        break;
                    case 3:
                        Scanner scanner3 = new Scanner(System.in);
                        Square square = new Square(scanner3);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(square);
                        break;
                    case 4:
                        Scanner scanner4 = new Scanner(System.in);
                        Rectangle rectangle = new Rectangle(scanner4,scanner4);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(rectangle);
                        break;
                    case 5:
                        Scanner scanner5 = new Scanner(System.in);
                        Trapezoid trapezoid = new Trapezoid(scanner5,scanner5,scanner5,scanner5,scanner5);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(trapezoid);
                        break;
                    case 6:                      
                        Scanner scanner6 = new Scanner(System.in);
                        Equilateral equilateralTriangle = new Equilateral(scanner6);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(equilateralTriangle);
                        break;
                    case 7:
                        Scanner scanner7 = new Scanner(System.in);
                        Isoceles isocelesTriangle = new Isoceles(scanner7,scanner7);
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(isocelesTriangle);
                        break;
                    case 8:
                        Scanner scanner8 = new Scanner(System.in);
                        Scalene scaleneTriangle = new Scalene(scanner8,scanner8,scanner8,scanner8);    
                        ui.ShapeCalculatorUI.printShapeAreaPerimeter(scaleneTriangle);
                        break;
                    case 9:
                        salida = true;
                        break;
                    default:
                        ui.ShapeCalculatorUI.errorMsg();       
            }
        }
    
    }

}
