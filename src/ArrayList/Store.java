package ArrayList;

import classes.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String name;
    String address;
    int numOfItems;
    double totalSale;

    ArrayList<Item> item = new ArrayList<>();

    public Store(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public void addItem(Item item) {

        this.item.add(item);
        this.numOfItems++;
    }

    public void addItem() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many items to enter?");
        int num = in.nextInt();
        in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("what is the item name?" + (i + 1));
            String name = in.nextLine();
            System.out.println("enter the price" + (i +  1));
            in.nextLine();
            double price = in.nextDouble();
            in.nextDouble();
            Item items = new Item(name, price);
            this.item.add(items);
            item.add(items);
            this.numOfItems++;
        }

    }

        public void sellItem(String Itemname ){
        for (int i=0; i<item.size(); i++){
            item.get(i).name.equals(Itemname);
                if(item.get(i).name.equals(Itemname)) {
                    this.totalSale += item.get(i).price;
                    item.remove(i);
                    System.out.println("successful transaction! Thank you for the money");
                    this.numOfItems--;
                    return;
                }
            }

        }
public void returnItem(String Itemname){
   Scanner in =new Scanner(System.in);
    System.out.println("enter your price of  item");
    double Itemprice = in.nextDouble();
   Item item = new Item(Itemname,Itemprice);// how we create an object
   this.item.add(item);
    this.totalSale-=Itemprice;
    this.numOfItems++;
    System.out.println("\nReturn process successful");

}

        public void seeInventory(){
            System.out.println("\n Zara chicago  store ");
            System.out.println("Total price "+ this.totalSale+ "$");
            for (Item item : item)
                item.info();
            System.out.println();

        }

}