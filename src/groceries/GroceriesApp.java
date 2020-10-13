package groceries;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

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

        groceryApp(categories, 1);
    }
public static void groceryApp(ArrayList<String> array, int count){
    HashMap<Integer, Grocery> shoppingList = new HashMap<>();
        Input prompt = new Input();
        boolean userConfirm = prompt.yesNo("Would you like to create a grocery list?");
        if (userConfirm){
            boolean secondConfirm = prompt.yesNo("Would you like to enter a new item to your grocery list?");
            if (secondConfirm){
                addList(shoppingList, count, array, prompt);
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
public static String groceryListCat (ArrayList<String> array){
    for(int list = 0; list < array.size(); list++){
        System.out.printf("%d : %s\n", list + 1, array.get(list));
    }
    Input response = new Input();
    String userInput = response.getString("Type in the number of the category the item belongs in.");
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
            groceryListCat(array);
            return "error";
    }

}
public static String groceryListName(){
        Input prompt = new Input();
        String userStr = prompt.getString("Enter the name of the name of the grocery item.");
        if(userStr.isEmpty()){
            System.out.println("Please enter a valid name for the grocery item.");
            groceryListName();
            return null;
        } else {
            return userStr;
        }
}
public static int groceryListQuan (Input prompt){
       return prompt.getInt("How many of the item do you want?");

}
public static void addList(HashMap<Integer, Grocery> shoppingList, int count, ArrayList<String> array, Input prompt) {
    shoppingList.put(count, new Grocery());
    shoppingList.get(count).setCategory(groceryListCat(array));
    shoppingList.get(count).setName(groceryListName());
    shoppingList.get(count).setQuantity(groceryListQuan(prompt));
    Input response = new Input();
    boolean thirdConfirm = response.yesNo("Would you like to add another item to your grocery list?");
    if (thirdConfirm) {
        addList(shoppingList, count + 1, array, prompt);
    } else {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(sortGrocery(shoppingList, "Beverages"));
        names.addAll(sortGrocery(shoppingList, "Bread/Bakery"));
        names.addAll(sortGrocery(shoppingList, "Canned/Jarred Goods"));
        names.addAll(sortGrocery(shoppingList, "Dairy"));
        names.addAll(sortGrocery(shoppingList, "Baking Goods"));
        names.addAll(sortGrocery(shoppingList, "Frozen Goods"));
        names.addAll(sortGrocery(shoppingList, "Meat"));
        names.addAll(sortGrocery(shoppingList, "Produce"));
        names.addAll(sortGrocery(shoppingList, "Other"));
        for (String name : names) {
            for (Grocery item : shoppingList.values()) {
                if (item.getName().equalsIgnoreCase(name)) {
                    printOut(item);
                }
            }
        }
    }
}
public static void printOut (Grocery item){
    System.out.println(item.getName() + " " + item.getCategory() + " " + item.getQuantity());
}
public static ArrayList<String> sortGrocery (HashMap<Integer, Grocery> data, String cat){
    ArrayList<String> addition = new ArrayList<>();
        for (Grocery item: data.values()){
            if(item.getCategory().equals(cat)) {
               addition.add(item.getName());
            }
        }
    Collections.sort(addition);
        return addition;
}
}

