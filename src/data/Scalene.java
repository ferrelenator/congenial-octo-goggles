package data;

public class Scalene extends Triangle {

    private double sideA,sideB,sideC;


    public Scalene(double[] lines) {
        this.sideA=lines[0];
        this.sideB=lines[1];
        this.sideC=lines[2];
    }
    
    @Override
    public String toString() {
        return super.toString().concat("Escaleno, lado A= ").concat(Double.toString(sideA)).concat(", lado B= ").concat(Double.toString(sideB)).concat(", lado C= ").concat(Double.toString(sideC));
    }
    
 

    @Override
    public void calculator() {
        double s=(sideA+sideB+sideC)/2;
        super.setPerimeter(2*s); 
        super.setArea(Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)));
         }


}
