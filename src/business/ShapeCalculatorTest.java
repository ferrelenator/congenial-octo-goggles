package business;
import data.*;
import java.util.ArrayList;
import ui.UIText;
import ui.UI;
import ui.UISwing;

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
    private static UI ui;
    
    private static void selectUI(String[] args) {
        if (args.length == 0) {
           ui = new UISwing();
        } else if (args[0].equals("text")) {
            ui = new UIText();
        } else {
            ui = new UISwing();
        }
    }
    
    public static void main(String[] args) {
        
        selectUI(args);
        
        listFigure= new ArrayList<>();
       
        boolean exit = false;
        while(!exit){
            ui.Menu();
           switch(ui.figures(listFigure)){
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
        int x=ui.figures(listFigure);
        try{
        listFigure.get(x).calculator();
        ui.printShapeAreaPerimeter(listFigure.get(x));
        }catch(IndexOutOfBoundsException ex){System.out.println("Digite solo los indices de las figuras");}
        }
    }
    public static void newFigure(){
         switch(ui.newfigure()){
                    case 1:
                        listFigure.add(new Circle(ui.newCircle()));
                        break;
                    case 2:
                        listFigure.add(new Semicircle(ui.newCircle()));
                        break;
                    case 3:
                        listFigure.add(new Square(ui.newSquare()));
                        break;
                    case 4:
                        listFigure.add(new Rectangle(ui.newRecatangle()));
                        break;
                    case 5:
                        listFigure.add(new Trapezoid(ui.newTrapezoid()));
                        break;
                    case 6:                      
                        listFigure.add(new Equilateral(ui.newEquilateral()));
                        break;
                    case 7:
                        listFigure.add(new Isoceles(ui.newIsoceles()));
                        break;
                    case 8:
                        listFigure.add(new Scalene(ui.newScaleno()));
                        break;
                    case 9:
                        break;    
                    default:
                        ui.errorMsg();       
            }
    }


    private static void deleteFigure() {
        int x=ui.deletefigure(listFigure);
        listFigure.remove(x);
    }
}
