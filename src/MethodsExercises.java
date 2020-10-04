import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    public static void addition (int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void subtraction (int num1, int num2){
        System.out.println(num1 - num2);
    }
    public static int multiplication (int num1, int num2){
        if(num2 == 0) {
            return 0;
        } else if (num2 == 1){
            return num1;
        } else if (num2 == 2){
            return num1 + num1;
        }
        return num1 + multiplication(num1, num2-1);
        /*int output = 0;
       for(int i = 1; i<=num2; i++){
           output+= num1;
       }
       System.out.println(output);*/
    }
    public static void division (float num1, int num2){
        System.out.println(num1 / num2);
    }
    public static void modulus (int num1, int num2){
        System.out.println(num1 % num2);
    }
    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10: ");
        Scanner range = new Scanner(System.in);
        int input = range.nextInt();
        if (input > max || input < min){
            return getInteger(min, max);
        } else {
            return input;
        }
    }
    public static int getIntegerDice(int min, int max){
        System.out.print("How many sides on the die?");
        Scanner range = new Scanner(System.in);
        int input = range.nextInt();
        if (input > max || input < min){
            return getIntegerDice(min, max);
        } else {
            return input;
        }
    }
    public static void factorial (){
        int userInput = getInteger(1,10);
        for (long i = 1; i<=userInput; i++){
            long output = 1;
            System.out.print(i + "! = ");
            for(long d = 1; d<=i; d++){
                if(d == i){
                    output*= d;
                    System.out.printf("%d = %d\n", d, output);
                } else {
                   output*= d;
                    System.out.print(d + " x ");
                }
            }
        }
        System.out.println("Do you want to continue? [yes/no]");
        Scanner response = new Scanner(System.in);
        if (response.nextLine().equalsIgnoreCase("yes")) {
            factorial();
        } else {
            System.out.println("Have a nice day!");
        }
    }
    public static void dice (){
        int sidesNum = getIntegerDice(1,24);
        Scanner dieInfo = new Scanner(System.in);
        System.out.println("Would you like to roll the dice? [yes/no]");
        if (dieInfo.nextLine().equalsIgnoreCase("yes")) {
            dice(sidesNum);
        } else {
            System.out.println("Have a nice day!");
        }
    }
    public static void dice(int num){
        int min = 1;
        int max = num + 1;
        int dice1 = (int) (Math.random() * (max - min + 1) + min);
        int dice2 = (int) (Math.random() * (max - min + 1) + min);
        System.out.printf("You rolled a %d and a %d !\n", dice1, dice2);
        System.out.println("Would you like to roll again? [yes/no]");
        Scanner response = new Scanner(System.in);
        if (response.nextLine().equalsIgnoreCase("yes")) {
            dice(num);
        } else {
            System.out.println("Have a nice day!");
        }
    }

    public static void main(String[] args){
        addition(5,2);
        subtraction(5,2);
        System.out.println(multiplication(5,2));
        division(5,0);
        modulus(5,2);
        //System.out.print("Enter a number between 1 and 10: ");
        //int userInput = getInteger(1, 10);
        factorial();
        //dice();
    }
}
