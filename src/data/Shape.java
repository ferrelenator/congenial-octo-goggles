package data;

/*Cada clase debe estar correctamente encapsulada.
• Cada clase debe ir en un archivo .java diferente.
• Cada clase debe tener un constructor explicito encargado de recibir y asignar
los valores de los atributos de la clase, así mismo el constructor debe reusar el
constructor de su antecesor (si tiene) mediante la utilización de la palabra
super.
• Cada clase debe tener un método toString que reúse y sobrescriba el de su
antecesor (si tiene).
• Las clases que fueron definidas abstractas en la fase de diseño deben ser
implementadas en código como tales usando la palabra reservada abstract.
*/

public abstract class Shape {
    
    private double area,perimeter;
    public abstract void calculator();

    @Override
    public String toString(){
    return "Figura ";
}
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
