package shapes;

public class Square extends Rectangle {
    public int side;
    public Square(int side){
        super(side, side);
        this.side = side;
    }
    public int getArea(){
    return this.side * this.side;
        }
        public int getPerimeter(){
        return this.side * 4;
        }
}
