package grades;
import java.util.ArrayList;
import java.util.HashMap;


public class Student {
    private String name;
    private ArrayList <Integer> grades;
    private HashMap <String, String> attendance;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double output = 0;
        for (double grade : this.grades){
            output += grade;
        }
        return output/this.grades.size();
    }
    public void recordAttendance(String date, String value){
        if (value.equalsIgnoreCase("P") || value.equalsIgnoreCase("A")) {
        this.attendance.put(date, value);
        } else {
            System.out.println("Error. Value is not an entry of 'P' or 'A'.");
        }
    }
    public double attendancePercent (){
        double counter = 0;
        for (String value : this.attendance.values()){
            if(value.equalsIgnoreCase("P")){
                counter++;
            }
        }
        return counter / this.attendance.keySet().size() * 100 ;
    }
    public ArrayList<String> absentSearch(){
        ArrayList<String> absentDays = new ArrayList<>();
        for (String key : this.attendance.keySet()){
            if(this.attendance.get(key).equalsIgnoreCase("A")){
                absentDays.add(key);
            }
        }
        return absentDays;
    }
    public static void main(String[]args){
Student billy = new Student("Billy");
        System.out.println(billy.getName());
        billy.addGrade(90);
        billy.addGrade(100);
        System.out.println(billy.getGradeAverage());
    }

}
