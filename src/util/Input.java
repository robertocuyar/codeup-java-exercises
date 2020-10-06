package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        //System.out.println("Type a response:");
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
       return getString();
    }
    public boolean yesNo(){
        //System.out.println("Enter y/N: ");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y")|| input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }
    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int input = scanner.nextInt();
        if(input < min || input > max){
          return getInt(min, max);
        } else {
            return input;
        }
    }
    public int getInt(){
        //System.out.println("Enter a number :");
        return scanner.nextInt();
        }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }
    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max + ":");
        double input = scanner.nextDouble();
        if(input < min || input > max){
            return getDouble(min, max);
        } else {
            return input;
        }
    }
    public double getDouble(){
        //System.out.println("Enter a number :");
        return scanner.nextDouble();
    }
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public static class OtherPerson {
            public String name;

            public OtherPerson(String nam) {
                this.name = nam;
            }
    }
}

