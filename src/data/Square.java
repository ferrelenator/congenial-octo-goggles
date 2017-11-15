package data;

import java.util.Scanner;

public class Square extends Quadrilateral {
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Square(Scanner scanner) {
        System.out.println("Ingrese el valor de la base: ");
        this.base = scanner.nextDouble();
        System.out.println();
    }
    
    @Override
    public String toString() {
        return super.toString()+" y más especificamente un cuadrado. ";
    }
    @Override 
    public void areaCalculation(){
        System.out.println(base*base);
    }
    @Override
    public void perimeterCalculation(){
        System.out.println(4*base);
    }
    
}
