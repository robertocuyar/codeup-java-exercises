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

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
