package shapes;
import util.Input;

public class CircleApp {
    public static void CircleDisplay(){
        while (true) {
            Input radius = new Input();
            Circle counter = new Circle(radius.getDouble("Enter a radius: "));
            int count = Circle.updateCount();
            System.out.println(counter.getArea());
            System.out.println(counter.getCircumference());
            Input response = new Input();
            boolean userInput = response.yesNo("Would you like to continue? y/N");
            if(!userInput) {
                System.out.println(count);
               break;
               }
        }

    }
public static void main(String[] args){
CircleDisplay();
}

}
