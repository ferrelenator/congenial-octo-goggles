package data;

public class Trapezoid extends Quadrilateral{
    private double baseA, baseB, sideA, sideB,angle;


    public Trapezoid(double[] lines) {
        this.baseA= lines[0];
        this.baseB= lines[1];
        this.sideA= lines[2];
        this.sideB= lines[3];
        this.angle=lines[4];
    }    
    @Override
    public String toString(){
        return super.toString().concat("Trapecio, Base A= ").concat(Double.toString(baseA)).concat(", BaseB= ").concat(Double.toString(baseB)).concat(", LadoA= ").concat(Double.toString(sideA)).concat(", LadoB= ").concat(Double.toString(sideB)).concat(", Angulo entre Base A y Lado A= ").concat(Double.toString(angle)) ;
    } 
    @Override
    public void calculator() {        
        double a1= 0.5*baseA*sideA*Math.sin(angle);
        double d1=Math.sqrt(Math.pow(baseA,2)+Math.pow(sideA,2)-(2*baseA*sideA*Math.cos(angle)));
        double s= (sideB+baseB+d1)/2;
        double a2=Math.sqrt(s*(s-sideB)*(s-baseB)*(s-d1));
        super.setArea(a1+a2);
        super.setPerimeter(baseA+baseB+sideB+sideA);  }
}