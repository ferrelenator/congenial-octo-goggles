package data;

import java.util.Scanner;

public class Circle extends Shape {
    
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Scanner scanner) {
        System.out.println("Ingrese el valor del radio: ");
        this.radius = scanner.nextDouble();
        System.out.println();
    }
    
    
    
    @Override
    public void areaCalculation(){
        System.out.println(Math.PI*(radius*radius));
    }

    @Override
    
    public String toString() {
        return "Soy un circulo. ";
    }
    
    @Override
    public void perimeterCalculation(){
        System.out.println(2*Math.PI*radius);
    }
}
