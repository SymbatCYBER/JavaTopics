package AccsessModifirer;

import java.util.ArrayList;

public class App {
   private String name;
   private String category;
   private double rating;
   private String description;
   private double size;
   private ArrayList<String> reviews;
   private  static int numOfApps;


   public App(String name, String category, double size){
      this.name=name;
      this.category=category;
      this. size=size;
      numOfApps++;
      this.reviews= new ArrayList<>();//intstanstiated

   }
   public  void  info(){
      System.out.println("Name"+ this.name);
      System.out.println("Category"+ this.category);
      System.out.println("Size"+ this.size);
      System.out.println("Rating"+ this.rating);
      System.out.println("Description " + this.description);

   }


   public static int getNumsApp(){
      return numOfApps;

   }

   public void open() {
      System.out.println(this.name + " is opening!");
   }

   public void close() {
      System.out.println(this.name + "is closing!");

   }

   public void update() {
      System.out.println(this.name+ " is up dating!");

   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public double getRating() {
      return rating;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public double getSize() {
      return size;
   }

   public void setSize(double size) {
      this.size = size;
   }

   public ArrayList<String> getReview() {
      return reviews;
   }

   public void setReview(String reviews) {

      if(reviews.length() >3){
         this.reviews.add(reviews);
         System.out.println("Success message!");
      }else {
         System.out.println(" invalid message");
      }
   }

}
