import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String myString = "What?";
        float myNumber = 3.14F;
        System.out.println("Hello, World!");
        //System.out.println(myFavoriteNumber);
        System.out.println(myString);
        System.out.println(myNumber);
        /*int x = 5;
        System.out.println(x++);
        System.out.println(x);*/
        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);
        String theNumberThree = "three";
        Object o = theNumberThree;
        //int three = (int) o;
        //int three = (int) "three";
        System.out.println(o);
        int x = 4;
        x += 5;
        System.out.println(x);
        //int x = 3;
        int y = 4;
        y *= x;
        System.out.println(y);
        //int x = 10;
        //int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);
        int experiment = Integer.MAX_VALUE;
        //experiment += 1;
        System.out.println(experiment);
        System.out.println();
        String greeting = "Salutations";
        String name = "Bob";
        System.out.printf("%s, %s!", name, greeting);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
