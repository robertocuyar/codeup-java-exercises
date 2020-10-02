import java.util.Scanner;
public class Bob {
    public static void main (String[] args){
        Scanner talk = new Scanner(System.in);
        boolean finish = true;
        String prompt = "Say something to Bob or type \"done\": ";
        do{
            System.out.println(prompt);
           String userInput = talk.nextLine();
           if (userInput.equalsIgnoreCase("done")){
               finish = false;
           } else if (userInput.lastIndexOf("?") != -1){
               System.out.println("Bob: Sure.");
           } else if(userInput.lastIndexOf("!") != -1){
               System.out.println("Bob: Whoa, chill out!");
           } else if(userInput.equalsIgnoreCase("")){
               System.out.println("Bob: Fine. Be that way!");
           } else {
               System.out.println("Bob: Whatever...");
           }

        } while(finish);
    }
}
