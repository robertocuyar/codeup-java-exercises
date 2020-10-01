import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

        /*int i = 5;
        while(i<= 15){
            System.out.printf("%d ", i);
            i++;
        }*/
        for (int i = 5; i<= 15; i++){
            System.out.printf("%d ", i);
        }
        System.out.printf("%n");
       /* long c = 2;
        do{
            System.out.println(c);
            c*= c;
        } while(c < 1000000 );*/
        for(int c = 2; c < 1000000; c *= c){
                System.out.println(c);
            if(c == 65536){
                break;
            }

        }
        System.out.printf("%n");
for (int b = 1; b <= 100; b++) {
   if( b % 15 == 0) {
       System.out.println("Fizz Buzz");
}else if( b % 3 == 0){
        System.out.println("Fizz");
    }else if( b % 5 == 0){
        System.out.println("Buzz");
    } else {
        System.out.println(b);
    }
}
        boolean confirmation = false;
        Scanner powers = new Scanner(System.in);
        /*do {
            System.out.print("What number would like to up to?");
            int chosen = powers.nextInt();
            System.out.printf("%n");
            System.out.println("Here is your table!");
            System.out.printf("%n");
            System.out.println("number | squared | cubed ");
            System.out.println("------ | ------- | ----- ");
            for(int n = 1; n <= chosen; n++){
                int sq = n * n;
                int cu = n * n * n;
                System.out.printf("%-7d| %-8d| %d    \n",n,sq,cu);
            }
            System.out.print("Continue? [y/N]");
            String userInput = powers.next();
            confirmation = userInput.equals("y");

        } while(confirmation);*/
        System.out.printf("%n");
        do {
            System.out.println("Please enter your numerical grade: ");
            int grade = powers.nextInt();
            if (grade >= 99){
                System.out.println("You got an A+ !");
            } else if(grade >= 93) {
                System.out.println("You got an A !");
            } else if(grade >=88) {
                System.out.println("You got an A- !");
            } else if(grade >= 86){
                System.out.println("You got an B+ !");
            } else if(grade >=83){
                System.out.println("You got an B !");
            } else if(grade >= 80){
                System.out.println("You got an B- !");
            } else if(grade >= 78){
                System.out.println("You got an C+ !");
            } else if (grade >=76){
                System.out.println("You got an C !");
            } else if (grade >=67){
                System.out.println("You got an C- !");
            } else if (grade >=65){
                System.out.println("You got an D+ .");
            } else if (grade >=63){
                System.out.println("You got an D .");
            } else if (grade >=60){
                System.out.println("You got an D- .");
            } else {
                System.out.println("You got an F ...");
            }
            System.out.print("Continue? [y/N]");
            String userInput = powers.next();
            confirmation = userInput.equals("y");

        } while(confirmation);

    }
}
