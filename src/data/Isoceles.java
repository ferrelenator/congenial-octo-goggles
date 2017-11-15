package data;

import java.util.Scanner;


public class Isoceles extends Triangle{
    private double base;
    private double side;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Isoceles(Scanner scanner, Scanner scanner2) {
        System.out.println("Ingrese el valor de la base: ");
        this.base = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado : ");
        this.side = scanner.nextDouble();
        System.out.println();
    }
    @Override
    public String toString() {
        return super.toString()+" y más especificamente un triangulo isoceles. ";
    }
    
    @Override 
    public void areaCalculation(){
        System.out.println((base*(Math.sqrt(Math.pow(side,2)-((Math.pow(base,2))/4))))/2);
    }
    
    @Override
    public void perimeterCalculation(){
        System.out.println((2*side)+base);
    }

}