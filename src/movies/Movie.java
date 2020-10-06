package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String nam, String cat){
        this.name = nam;
        this.category = cat;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String nam){
        this.name = nam;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String cat){
        this.category = cat;
    }
}
