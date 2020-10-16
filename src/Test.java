import grades.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;



public class Test {


    public static void main(String[] args) throws IOException {

Path dataFile = Paths.get("data", "info.text");
FileWriter fw = new FileWriter(dataFile.toString());
Student bill = new Student("Bill");
bill.addGrade(100);
for (int i = 0; i < 10; i++){
    fw.write(String.format("%-20s%-20s\n",bill.getName(), bill.getGradeAverage()));
}
fw.close();
List<String> lines = Files.readAllLines((dataFile));
for  (String line : lines){
    System.out.println(line);
}

    }
}
