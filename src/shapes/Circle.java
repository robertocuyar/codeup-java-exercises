package shapes;

public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }
}
