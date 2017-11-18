package data;

public class Isoceles extends Triangle{
    
    private double base;
    private double side;

     public Isoceles(double[] lines) {
       this.base = lines[0];
       this.side = lines[1];
    }
    
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
    @Override
    public String toString() {
        return super.toString().concat("Isoceles, Base=").concat(Double.toString(base)).concat(", Altura=").concat(Double.toString(side));
    }
    @Override
    public void calculator() {
       super.setArea((base*(Math.sqrt(Math.pow(side,2)-((Math.pow(base,2))/4))))/2);
       super.setPerimeter((2*side)+base); 
    }
}