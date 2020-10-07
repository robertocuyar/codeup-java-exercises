package shapes;

public class Square extends Quadrilateral {
    public double side;
    public Square(double side){
        super(side, side);
        this.side = side;
    }
      public double setLength(double length){
       return this.length = length;
    }
    public double setWidth(double width){
        return this.width = width;
    }

    public double getArea(){
    return this.side * this.side;
        }
        public double getPerimeter(){
        return this.side * 4;
        }

}
