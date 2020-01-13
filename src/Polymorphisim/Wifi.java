package Polymorphisim;

public interface Wifi {

   public abstract void searchWiFi(); // abstract methods
    public static  void m(){
        System.out.println(" Static methods ");
    }// static methods

    public  default void d (){

    }// default methods
}
