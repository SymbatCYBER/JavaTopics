package classes;


import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {
Item myItem = new Item("nn",123);
       Scanner in = new Scanner(System.in);
       int numOfitems = in.nextInt();
       in.nextInt();

       Item [] myItems = new Item[numOfitems];
       for (int i=0; i< myItems.length; i++){
           System.out.println("enter your Items "+ (i+1));
           String item = in.nextLine();
           System.out.println("Enter the price of item"+ (i+1));
           double price =in.nextDouble();
           in.nextLine();
           myItems[i] = new Item (item,price);
       }
         for (Item item: myItems){
             item.info();

         }
        }

    }

