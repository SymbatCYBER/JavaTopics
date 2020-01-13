package Polymorphisim;

public class Aeron extends  Chair   {


    @Override
    public void sit() {
        System.out.println(" Sitting on chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping  on Aeron chair ");
    }
}
