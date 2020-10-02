import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args){
       int actual = randomNumber();
           game(actual, 1);

    }
    public static int randomNumber () {
        int min = 1;
        int max = 100;
        int random_int = (int) (Math.random() * (max - min + 1) + min);
        return random_int;
    }
    public static void game(int num, int cntr){
        int userInput = getInteger(1, 100);
        if(cntr == 10){
            System.out.println("GAME OVER");
            int actual = randomNumber();
            game(actual, 1);
        }else if (userInput == num){
            System.out.println("GOOD GUESS!");
            System.out.println("You finished in " + cntr + " move(s).");
        }else if(userInput < num){
            System.out.println("HIGHER");
            System.out.println("Move: " + cntr);
            game(num, cntr + 1);
        } else {
            System.out.println("LOWER");
            System.out.println("Move: " + cntr);
            game(num, cntr + 1);
        }
    }
    public static int getInteger(int min, int max){
        System.out.println("Guess a number between 1 and 100");
        Scanner range = new Scanner(System.in);
        int input = range.nextInt();
        if (input > max || input < min){
            return getInteger(min, max);
        } else {
            return input;
        }
    }
}
