package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
       return getString();
    }
    public boolean yesNo(){
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
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
       String str = getString();
        try{
            return Integer.valueOf(str);
        }
        catch (NumberFormatException e){
            System.out.println("Please enter a valid integer value.");
            return getInt();
        }
        }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }
    public int getBinary(){
        String userResponse = getString("Please enter a binary number: ");
        if(userResponse.matches("[0-1]+")){
            try {
                return Integer.valueOf(userResponse, 2);
            } catch(Exception e){
                System.out.println(e.getMessage());
               return getBinary();
            }
        } else {
            System.out.println("Please enter a valid binary number.");
            return getBinary();
        }
    }
    public int getHex () {
        String userResponse = getString("Please enter a hexadecimal number: ");
        if (userResponse.matches("[0-9a-fA-F]+")) {
            try {
                return Integer.valueOf(userResponse, 16);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return getHex();
            }
        } else {
            System.out.println("Please enter a valid hexadecimal number.");
            return getHex();
        }
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
        String str = getString();
        try{
            return Double.valueOf(str);
        }
        catch (NumberFormatException e){
            System.out.println("Please enter a valid double value.");
            return getDouble();
        }
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

