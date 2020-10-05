public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

   public void printSummary(){
       System.out.printf("Cost: %s\nName: %s\nRecommended: %s", this.costInCents, this.nameOfDish, this.wouldRecommend);

   }

}
