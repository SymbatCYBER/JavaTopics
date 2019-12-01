package StaticClass;

public class BestBuysSTORE {
    public static void main(String[] args) {
        BestBuy storeOne =new BestBuy();
        BestBuy storeTwo = new BestBuy();
        System.out.println(storeOne.numOfComputes);
        storeOne.numOfComputes--;
        System.out.println(storeTwo.numOfComputes);
    }
}
