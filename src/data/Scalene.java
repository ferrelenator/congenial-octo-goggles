package data;

import java.util.Scanner;


public class Scalene extends Triangle {
    private double base;
    private double height;
    private double sideA;
    private double SideC;

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

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double SideC) {
        this.SideC = SideC;
    }

    public Scalene(Scanner scanner, Scanner scanner1, Scanner scanner2, Scanner scanner3) {
        System.out.println("Ingrese el valor de la base: ");
        this.base = scanner.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        this.height = scanner1.nextDouble();
        System.out.println("Ingrese el valor del lado A: ");
        this.sideA = scanner2.nextDouble();
        System.out.println("Ingrese el valor del lado C: ");
        this.SideC = scanner3.nextDouble();
        System.out.println();
    }
    
    @Override
    public String toString() {
        return super.toString()+" y más especificamente un triangulo escaleno. ";
    }
    
    @Override 
    public void areaCalculation(){
        System.out.println((base*height)/2);
    }
    
    @Override
    public void perimeterCalculation(){
        System.out.println(sideA+base+SideC);
    }


}
