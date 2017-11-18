/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public class Semicircle extends Circle {
    
    public Semicircle(double radius) {
        super(radius);
    }

    @Override
    public void calculator(){
        super.calculator();
        super.setArea(super.getArea()/2);
        super.setPerimeter(super.getPerimeter()/2);
    }
    
    @Override
    public String toString() {
        return super.toString()+"Semicirculo ";
    }
}
