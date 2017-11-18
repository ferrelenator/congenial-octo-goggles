package business;
import data.*;
import java.util.ArrayList;
import ui.UI;

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
    private static ArrayList<Shape> listFigure;
    
    public static void main(String[] args) {
        
        listFigure= new ArrayList<>();
        boolean exit = false;
        while(!exit){
           switch(UI.Menu()){
                case 1:
                   calculator();
                break;
                case 2:
                    newFigure();
                break;
                case 3:
                    deleteFigure();
                break;
                case 4:
                    System.exit(0);
                break;
           }
               
        }
    
    }
    
    public static void calculator() {
        if(!listFigure.isEmpty()){
        int x=UI.figures(listFigure);
        listFigure.get(x).calculator();
        UI.printShapeAreaPerimeter(listFigure.get(x));}else{newFigure();}
    
    }
    public static void newFigure(){
         switch(UI.newfigure()){
                    case 1:
                        listFigure.add(new Circle(UI.newCircle()));
                        break;
                    case 2:
                        listFigure.add(new Semicircle(UI.newCircle()));
                        break;
                    case 3:
                        listFigure.add(new Square(UI.newSquare()));
                        break;
                    case 4:
                        listFigure.add(new Rectangle(UI.newRecatangle()));
                        break;
                    case 5:
                        listFigure.add(new Trapezoid(UI.newTrapezoid()));
                        break;
                    case 6:                      
                        listFigure.add(new Equilateral(UI.newEquilateral()));
                        break;
                    case 7:
                        listFigure.add(new Isoceles(UI.newIsoceles()));
                        break;
                    case 8:
                        listFigure.add(new Scalene(UI.newScaleno()));
                        break;
                    case 9:
                        break;    
                    default:
                        ui.UI.errorMsg();       
            }
    }


    private static void deleteFigure() {
        int x=UI.deletefigure(listFigure);
        listFigure.remove(x);
    }
}
