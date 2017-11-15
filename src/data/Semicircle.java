/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author ferrelenator
 */
public class Semicircle extends Circle {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Semicircle(Scanner scanner) {
        super(scanner);
        System.out.println("Ingrese el valor del diametro: ");
        this.diameter = scanner.nextDouble();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString()+"y más especificamente, un semicirculo. ";
    }
    
    @Override 
    public void areaCalculation(){
        System.out.println((Math.PI*(((diameter)/2)*((diameter)/2)))/2);
    }
    
    @Override
    public void perimeterCalculation(){
        System.out.println(Math.PI*(diameter/2));
    }
}
