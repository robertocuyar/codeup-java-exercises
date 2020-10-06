import java.lang.Math;

public class ServerNameGenerator {


    public static void main(String[] args) {
        String[] adjectives = {"uncovered", "roasted", "lucky", "rare", "shivering", "faulty", "soggy", "dangerous", "waggish", "silly"};
        String[] nouns = {"breath", "dime", "bed", "anger", "ants", "plot", "step", "rainstorm", "eyes", "basket"};
        int randomIndex = (int) (Math.random() * (10));
        int randomIndex2 = (int) (Math.random() * (10));
        System.out.printf("Here is your server name:\n %s-%s", adjectives[randomIndex], nouns[randomIndex2]);
    }

}

