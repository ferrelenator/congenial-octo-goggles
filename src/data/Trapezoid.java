package data;

import java.util.Scanner;

public class Trapezoid extends Quadrilateral{
    private double majorBase;
    private double minorBase;
    private double height;
    private double sideA;
    private double sideB;

    public double getMajorBase() {
        return majorBase;
    }

    public void setMajorBase(double majorBase) {
        this.majorBase = majorBase;
    }

    public double getMinorBase() {
        return minorBase;
    }

    public void setMinorBase(double minorBase) {
        this.minorBase = minorBase;
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

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Trapezoid(Scanner scanner,Scanner scanner2, Scanner scanner3, Scanner scanner4,Scanner scanner5) {
        System.out.println("Ingrese el valor de la base mayor: ");
        this.majorBase = scanner.nextDouble();
        System.out.println("Ingrese el valor de la base menor: ");
        this.minorBase = scanner2.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        this.height = scanner3.nextDouble();
        System.out.println("Ingrese el valor del lado derecho: ");
        this.sideA = scanner4.nextDouble();
        System.out.println("Ingrese el valor del lado izquierdo: ");
        this.sideB = scanner5.nextDouble();
        System.out.println();
    }

    
    
    @Override
    public String toString(){
        return super.toString()+" y más especificamente un trapecio. ";
    }
    
    @Override
    public void areaCalculation(){
        System.out.println((height*(majorBase+minorBase))/2);
    }

    @Override
    public void perimeterCalculation(){
        System.out.println(majorBase+minorBase+sideB+sideA);
    }
}