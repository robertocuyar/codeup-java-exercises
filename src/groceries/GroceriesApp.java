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
        categories.add("Frozen Goods");
        categories.add("Meat");
        categories.add("Produce");
        categories.add("Other");

        groceryApp(categories, 1000);
    }

    public static void groceryApp(ArrayList<String> array, int count) {
        HashMap<Integer, Grocery> shoppingList = new HashMap<>();
        Input prompt = new Input();
        boolean userConfirm = prompt.yesNo("Would you like to create a grocery list?");
        if (userConfirm) {
            boolean secondConfirm = prompt.yesNo("Would you like to enter a new item to your grocery list?");
            if (secondConfirm) {
                addList(shoppingList, count, array, prompt);
            } else {
                System.out.println("Come visit us again. Have a nice day!");
                System.exit(0);
            }
        } else {
            System.out.println("Come visit us again. Have a nice day!");
        }
    }

    public static void spacing() {
        System.out.printf("%n");
    }

    public static String groceryListCat(ArrayList<String> array) {
        for (int list = 0; list < array.size(); list++) {
            System.out.printf("%d : %s\n", list + 1, array.get(list));
        }
        spacing();
        Input response = new Input();
        String userInput = response.getString("Type in the number of the category the item belongs in.");
        switch (userInput) {
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

    public static String groceryListName() {
        Input prompt = new Input();
        String userStr = prompt.getString("Enter the name of the name of the grocery item.");
        if (userStr.isEmpty()) {
            System.out.println("Please enter a valid name for the grocery item.");
            groceryListName();
            return null;
        } else {
            return userStr;
        }
    }

    public static int groceryListQuan(Input prompt) {
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
            Input response5 = new Input();
            boolean userConfirm = response5.yesNo("Would you like to filter your list by a category?[Y/N]");
            if (userConfirm) {
                filterList(names, array, shoppingList);
            }
           for (String category: array){
                names.addAll(sortGrocery(shoppingList, category));
            }
            System.out.printf("%-15s|%-15s|%-20s|%-15s\n", "ID Number", "Item Name", "Category", "Quantity");
            for (String name : names) {
                for (int item : shoppingList.keySet()) {
                    if (shoppingList.get(item).getName().equalsIgnoreCase(name)) {
                        System.out.printf("%-15d|", item);
                        printOut(shoppingList.get(item));
                    }
                }
            }
        }
    }

    public static void printOut(Grocery item) {
        System.out.printf("%-15s|%-20s|%-15d\n",item.getName(), item.getCategory(), item.getQuantity());
    }

    public static ArrayList<String> sortGrocery(HashMap<Integer, Grocery> data, String cat) {
        ArrayList<String> addition = new ArrayList<>();
        for (Grocery item : data.values()) {
            if (item.getCategory().equals(cat)) {
                addition.add(item.getName());
            }
        }
        Collections.sort(addition);
        return addition;
    }

    public static void filterList(ArrayList<String> names, ArrayList<String> array, HashMap<Integer, Grocery> data) {
        names.clear();
        String inputCat = groceryListCat(array);
        ArrayList<String> compareArr = new ArrayList<>();
        for (Grocery list : data.values()){
            compareArr.add(list.getCategory());
        }
        if(compareArr.contains(inputCat)){
            System.out.printf("%-15s|%-15s|%-20s|%-15s\n", "ID Number", "Item Name", "Category", "Quantity");
            names.addAll(sortGrocery(data, inputCat));
            for (String name : names) {
                for (int item : data.keySet()) {
                    if (data.get(item).getName().equalsIgnoreCase(name)) {
                        System.out.printf("%-15d|", item);
                        printOut(data.get(item));
                    }
                }
            }
            spacing();
            Input response2 = new Input();
            boolean userConfirm2 = response2.yesNo("Would you like to filter your list by a category again? [Y/N]");
            if (userConfirm2) {
                filterList(names, array, data);
            } else {
                System.out.println("Thank you! Have a wonderful day.");
                System.exit(0);
            }
        } else {
            System.out.println("Category was not found on your list.");
            filterList(names, array, data);
        }
    }

    public static void editList () {
        Input response = new Input();
        boolean confirm = response.yesNo("Would you like to edit one of your list items?");
        if (confirm){
            Input response2 = new Input();
            int itemNum = response2.getInt("Which item number would you like to edit?");

        }

    }
}

