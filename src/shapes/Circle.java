package shapes;

public class Circle {
    private double radius;
    private static int counter = 0;

    public Circle (double radius){
        this.radius = radius;
    }
    public static int updateCount(){
        return counter+= 1;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }
}
