package data;

public class Circle extends Shape  {
    
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculator(){
        super.setArea(Math.PI*Math.pow(radius,2));
        super.setPerimeter(2*Math.PI*radius);
    }
    @Override
    public String toString() {
        return super.toString().concat("Circulo, Radio= ").concat(Double.toString(radius));
    }
    
  

   
}
