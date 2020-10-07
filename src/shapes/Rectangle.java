package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    /*protected int length;
    protected int width;
*/
    public Rectangle(int length, int width){
        super(length, width);
        /*this.length = length;
        this.width = width;*/
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return this.length * 2 + this.width * 2;
    }

    public double setLength(double length){
       return this.length = length;
    }
    public double setWidth(double width){
        return this.width = width;
    }
}
