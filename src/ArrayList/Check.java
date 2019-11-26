package ArrayList;

import classes.Item;

public class Check {
    public static void main(String[] args) {
        Store zara = new Store("Zara ", "Chicago");
        Item item1 = new Item("Soks", 15);
        Item item2 = new Item ("coat", 85);
        Item item3 = new Item ("Jeans ", 50);

        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);

        System.out.println(zara.numOfItems);
        zara.seeInventory();
        zara.addItem();
        zara.seeInventory();
        zara.sellItem("Coat");
        zara.seeInventory();
        System.out.println(zara.totalSale);
        zara.returnItem("Table");
        zara.seeInventory();


    }
}
