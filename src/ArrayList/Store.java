package ArrayList;

import classes.Item;

import java.util.ArrayList;

public class Store {
    String name;
    String address ;
    int numOfItems;

    ArrayList<Item> item = new ArrayList<>();

    public  Store (String name, String address){
        this.name= name;
        this.address= address;

    }

   public  void addItem(Item item){

       this.item.add(item);
      this.numOfItems++;



   }
  public  void seeInventory() {
        for (Item item: item)
        item.info();
      System.out.println();

  }
}
//    String name ;
//    double price;
//    int size;
