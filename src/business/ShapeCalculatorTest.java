package business;
import data.*;
import java.util.ArrayList;
import ui.UIText;

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
           switch(UIText.Menu()){
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
        int x=UIText.figures(listFigure);
        listFigure.get(x).calculator();
        UIText.printShapeAreaPerimeter(listFigure.get(x));}else{newFigure();}
    
    }
    public static void newFigure(){
         switch(UIText.newfigure()){
                    case 1:
                        listFigure.add(new Circle(UIText.newCircle()));
                        break;
                    case 2:
                        listFigure.add(new Semicircle(UIText.newCircle()));
                        break;
                    case 3:
                        listFigure.add(new Square(UIText.newSquare()));
                        break;
                    case 4:
                        listFigure.add(new Rectangle(UIText.newRecatangle()));
                        break;
                    case 5:
                        listFigure.add(new Trapezoid(UIText.newTrapezoid()));
                        break;
                    case 6:                      
                        listFigure.add(new Equilateral(UIText.newEquilateral()));
                        break;
                    case 7:
                        listFigure.add(new Isoceles(UIText.newIsoceles()));
                        break;
                    case 8:
                        listFigure.add(new Scalene(UIText.newScaleno()));
                        break;
                    case 9:
                        break;    
                    default:
                        ui.UIText.errorMsg();       
            }
    }


    private static void deleteFigure() {
        int x=UIText.deletefigure(listFigure);
        listFigure.remove(x);
    }
}
