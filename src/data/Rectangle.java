package data;

public class Rectangle extends Quadrilateral {
    
    private double base,height;  

   
    public Rectangle(double[] lines) {
        this.base = lines[0];
        this.height = lines[1];
    }

    @Override
    public String toString() {
        return super.toString().concat("Rectangulo, Base= ").concat(Double.toString(base)).concat(", Altura= ").concat(Double.toString(height));
    }
    
    @Override
    public void calculator() {
       super.setArea(base*height);
       super.setPerimeter((2*base)+(2*height)); 
    }

   

    
}
