package grades;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap<>();
        Student echo = new Student ("Echo");
        Student zahir = new Student ("Zahir");
        Student johnny = new Student ("Johnny");
        Student bonnie = new Student ("Bonnie");

        echo.addGrade(89);
        echo.addGrade(78);
        echo.addGrade(99);
        zahir.addGrade(95);
        zahir.addGrade(67);
        zahir.addGrade(100);
        johnny.addGrade(88);
        johnny.addGrade(77);
        johnny.addGrade(84);
        bonnie.addGrade(100);
        bonnie.addGrade(100);
        bonnie.addGrade(100);

        students.put("esolidad2", echo);
        students.put("zbonas17", zahir);
        students.put("johnNY44", johnny);
        students.put("bextravagant", bonnie);

        System.out.println("Welcome!");
        spacing();
        studentApp(students);


    }
    public static void studentApp(HashMap<String, Student> object){
        System.out.println("Here are the GitHub usernames of our students:");
        spacing();
        userNameDisplay(object);
        spacing();
        spacing();
        Input strResponse = new Input();
        String userInput = strResponse.getString("What student would you like to see more information on?");
        if(object.containsKey(userInput)){
            System.out.printf("Name: %s - GitHub Username: %s\n", object.get(userInput).getName(), userInput);
            System.out.printf("Current Average: %f\n", object.get(userInput).getGradeAverage());
            System.out.print("Grades: ");
            for (Integer grade : object.get(userInput).getGrades()){
                System.out.print(grade + " ");
            }
           spacing();
            boolean userConfirm = strResponse.yesNo("Would you like to see another student? [y/N]");
            spacing();
            if (userConfirm) {
                studentApp(object);
            } else {
                System.out.println("Thank you! Have a wonderful day!");
            }
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", userInput);
            spacing();
            studentApp(object);
        }

    }
    public static void userNameDisplay(HashMap<String, Student> input){
        for (String username: input.keySet()){
            System.out.print("|" + username + "| ");
        }
    }
    public static void spacing (){
        System.out.printf("%n");
    }
}
