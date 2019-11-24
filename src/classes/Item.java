package classes;

public class    Item  {
    String name ;
    double price;
    int size;

    public   Item( String name, double price){
      this. name = name;
       this. price = price;
    }
    //Overload the constructor that takes 3 parameters to set all 3 instanse variable

    public  Item (String name, double price, int size ){
        this.name= name;
        this.price=price;
        this.size=size;
    }
      // we can call constractor inside another constructor.
    // it is called constructur  chaining
    // we can do it using keyword "this"   with this parameters


        public void info() {
            System.out.println("\nThis name: " + this.name );
            System.out.println("this price  " + price);

        }


}
