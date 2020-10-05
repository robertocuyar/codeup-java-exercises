package shapes;
import util.Input;

public class CircleApp {
    private static int counter = 0;
    public static void CircleDisplay(){
        while (true) {
           counter = counter++;
            Input radius = new Input();
            Circle counter = new Circle(radius.getDouble("Enter a radius: "));
            System.out.println(counter.getArea());
            System.out.println(counter.getCircumference());
            Input response = new Input();
            boolean userInput = response.yesNo("Would you like to continue? y/N");
            if(!userInput) {
                System.out.println("You have made " + counter + " circle(s).");
               break;
               }
        }

    }
public static void main(String[] args){
CircleDisplay();
}

}
