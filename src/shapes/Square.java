package shapes;

public class Square extends Quadrilateral {
    public double side;
    public Square(double side){
        super(side, side);
        this.side = side;
    }
      public void setLength(double length){
       this.length = length;
       this.width = length;
    }
    public void setWidth(double width){
        this.width = width;
        this.length = width;
    }

    public double getArea(){
    return this.side * this.side;
        }
        public double getPerimeter(){
        return this.side * 4;
        }

}
