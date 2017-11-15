package data;

import java.util.Scanner;

public class Rectangle extends Quadrilateral {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(Scanner scanner1,Scanner scanner2) {
        System.out.println("Ingrese el valor de la base: ");
        this.base = scanner1.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        this.height = scanner2.nextDouble();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString()+" y más especificamente un rectangulo. ";
    }
    
    @Override 
    public void areaCalculation(){
        System.out.println(base*height);
    }
    @Override
    public void perimeterCalculation(){
        System.out.println((2*base)+(2*height));
    }
}
