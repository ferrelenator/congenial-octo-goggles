package data;

import java.util.Scanner;

public class Equilateral extends Triangle{
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Equilateral(Scanner scanner) {
        System.out.println("Ingrese el valor de la base: ");
        this.base = scanner.nextDouble();
        System.out.println();
    }
    
    @Override
    public String toString() {
        return super.toString()+" y más especificamente un triangulo equilatero. ";
    }
    @Override 
    public void areaCalculation(){
        System.out.println(((Math.sqrt(3))/4)*base);
    }
    @Override
    public void perimeterCalculation(){
        System.out.println(3*base);
    }
}
