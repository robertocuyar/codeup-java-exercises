package grades;
import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList <Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
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
    public static void main(String[]args){
Student billy = new Student("Billy");
        System.out.println(billy.getName());
        billy.addGrade(90);
        billy.addGrade(100);
        System.out.println(billy.getGradeAverage());
    }

}
