package groceries;

public class Grocery {
    private String name;
    private String category;
    private int quantity;

    public Grocery () {
        //this.name = aName;
        //this.category = aCategory;
        //this.quantity = aQuantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
}
