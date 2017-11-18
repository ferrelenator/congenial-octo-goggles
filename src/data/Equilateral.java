package data;

public class Equilateral extends Triangle{
    
    private double base;

    public Equilateral(double base) {
        this.base=base;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public String toString() {
        return super.toString().concat(" Equilatero, Arista=").concat(Double.toString(base));
    }
    @Override
    public void calculator() {
        super.setArea(((Math.sqrt(3))/4)*base);
        super.setPerimeter(3*base); }
}
