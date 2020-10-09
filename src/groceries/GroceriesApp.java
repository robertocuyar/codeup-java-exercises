package groceries;
import java.util.ArrayList;
import java.util.HashMap;

import util.Input;

public class GroceriesApp {
    public static void main(String[] args) {
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Beverages");
        categories.add("Bread/Bakery");
        categories.add("Canned/Jarred Goods");
        categories.add("Dairy");
        categories.add("Baking Goods");
        categories.add("Frozen Foods");
        categories.add("Meat");
        categories.add("Produce");
        categories.add("Other");

        groceryApp(categories);
    }
public static void groceryApp(ArrayList<String> array){
    HashMap<Integer, Grocery> shoppingList = new HashMap<>();
    int listItem = 1;
        Input prompt = new Input();
        boolean userConfirm = prompt.yesNo("Would you like to create a grocery list?");
        if (userConfirm){
            boolean secondConfirm = prompt.yesNo("Would you like to enter a new item to your grocery list?");
            if (secondConfirm){
                shoppingList.put(listItem, new Grocery(groceryListCat(array,prompt)));
                shoppingList.get(listItem).setName(groceryListName(prompt));





            } else {
                System.out.println("Come visit us again. Have a nice day!");
                System.exit(0);
            }
        } else {
            System.out.println("Come visit us again. Have a nice day!");
        }
}
public static void spacing(){
    System.out.printf("%n");
}
public static String groceryListCat (ArrayList<String> array, Input prompt){
    for(int list = 0; list < array.size(); list++){
        System.out.printf("%d : %s\n", list + 1, array.get(list));
    }
    String userInput = prompt.getString("Type in the number of the category the item belongs in.");
    switch (userInput){
        case "1":
            return "Beverages";
        case "2":
            return "Bread/Bakery";
        case "3":
            return "Canned/Jarred Goods";
        case "4":
            return "Dairy";
        case "5":
            return "Baking Goods";
        case "6":
            return "Frozen Goods";
        case "7":
            return "Meat";
        case "8":
                return "Produce";
        case "9":
            return "Other";
        default:
            System.out.println("Please enter a valid number from the categories list.");
            groceryListCat(array, prompt);
            return null;
    }

}
public static String groceryListName(Input prompt){
        String userStr = prompt.getString("Enter the name of the name of the grocery item.");
        if(userStr.isEmpty()){
            System.out.println("Please enter a valid name for the grocery item.");
            groceryListName(prompt);
            return null;
        } else {
            return userStr;
        }
}
}
