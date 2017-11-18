package data;

public class Square extends Quadrilateral {
    private double base;

    public Square(double base) {
        this.base=base;
    }
    @Override
    public String toString() {
        return super.toString().concat("Cuadrado, Arista=").concat(Double.toString(base));
    }
    @Override
    public void calculator() {
        super.setArea(Math.pow(base,2));
        super.setPerimeter(base*4); 
    }    
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    } 
}
