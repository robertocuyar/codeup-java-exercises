package movies;
import util.Input;


import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
runApp(MoviesArray.findAll());

    }
    public static void runApp (Movie[] array){
        System.out.println("What would you like to do?");
        System.out.printf("%n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a movie to the list");
        System.out.printf("%n");
        System.out.print("Enter your choice: ");
        Input response = new Input();
        String userInput = response.getString();
        switch (userInput) {
            case "0":
                System.out.println("Have a nice day!");
                break;
            case "1":
                System.out.printf("%n");
                for (Movie movie : array){
                    System.out.printf("%s -- %s\n", movie.getName(),movie.getCategory());
                }
                System.out.printf("%n");
                runApp(array);
                break;
            case "2":
                System.out.printf("%n");
                for (Movie movie : array){
                    if(movie.getCategory().equals("animated")) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                }
                System.out.printf("%n");
                runApp(array);
                break;
            case "3":
                System.out.printf("%n");
                for (Movie movie : array){
                    if(movie.getCategory().equals("drama")) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                }
                System.out.printf("%n");
                runApp(array);
                break;
            case "4":
                System.out.printf("%n");
                for (Movie movie : array){
                    if(movie.getCategory().equals("horror")) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                }
                System.out.printf("%n");
                runApp(array);
                break;
            case "5":
                System.out.printf("%n");
                for (Movie movie : array){
                    if(movie.getCategory().equals("scifi")) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                }
                System.out.printf("%n");
                runApp(array);
                break;
            case "6":
                System.out.printf("%n");
                String userMovie = response.getString("Enter a movie name: ");
                String userCat = response.getString("Enter a category for the movie: ").toLowerCase();
               Movie add  = new Movie (userMovie, userCat);
                System.out.printf("%n");
                runApp(addInfo(array, add));
                break;
            default:
                System.out.printf("%n");
                System.out.println("Please enter a valid number.");
                System.out.printf("%n");
                runApp(array);
                break;
        }
    }
    public static Movie[] addInfo(Movie[] array, Movie plus) {
        int changeLength = array.length + 1;
        Movie[] outArray = Arrays.copyOf(array, changeLength);
        outArray[changeLength - 1] = plus;
        return outArray;
    }
}
