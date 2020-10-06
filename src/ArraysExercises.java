import util.Person;
import java.util.Arrays;
public class ArraysExercises {

    public static void main (String[] args){
       /*int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));*/
        Person[] people = new Person[3];
        people[0] = new Person("Bob");
        people[1] = new Person("Susie");
        people[2] = new Person ("Rick");
       for(Person person : addPerson(people, new Person("Jim"))){
           System.out.println(person.name);
       }

    }
public static Person[] addPerson(Person[] array, Person plus){
        int changeLength = array.length + 1;
        Person[] outArray = Arrays.copyOf(array, changeLength);
        outArray[changeLength - 1] = plus;
        return outArray;



}

}

