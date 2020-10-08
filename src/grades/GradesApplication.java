package grades;
import java.util.HashMap;
import java.util.ArrayList;
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

    updateAttendance(students);
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
        String userInput = strResponse.getString("What student would you like to see more information on? [Type 'all' to see all student grades]");
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
        }else if(userInput.equalsIgnoreCase("all")){
            int output = 0;
            double average;
            double count = 0;
            for (Student name: object.values()){
                System.out.printf("%s: ", name.getName());
                for(Integer grade : name.getGrades()){
                    System.out.print(grade + " ");
                    output+= grade;
                    count++;
                }
                spacing();
            }
            average = output;
            System.out.println("The class average is: " + (average / count));
            spacing();
           boolean csvResponse = strResponse.yesNo("Would you like a preview of the data in CSV format?");
           spacing();
            if (csvResponse){
                System.out.println("name,github_username,average");
                for (String username: object.keySet()){
                    System.out.printf("%s,%s,%05.2f\n",object.get(username).getName(), username, object.get(username).getGradeAverage());
                    System.out.println("Going back to the main menu...");
                    studentApp(object);
                }
            } else {
                System.out.println("Going back to the main menu...");
                studentApp(object);
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
    public static void updateAttendance (HashMap<String, Student> object){
        Input prompt = new Input();
        String strResponse = prompt.getString("Enter a student name to update their attendance.");
       for(Student student : object.values()){
           if (strResponse.equalsIgnoreCase(student.getName())){
               String enterDate = prompt.getString("Enter date of attendance.");
               //String enterInfo = prompt.getString()

           }
       }
    }
}
