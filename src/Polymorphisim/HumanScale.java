package Polymorphisim;

public class HumanScale  extends Chair implements Roleabble, Collapsible{

    @Override
    public void sit() {
        System.out.println(" Sitting on Human scale chair ");
    }


    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Human Scale  chair ");
    }


    @Override
    public void lock() {
        System.out.println(" locking Human ");
    }

    @Override
    public void unlock() {
        System.out.println(" Human is unlocking ");
    }


    @Override
    public void fold() {
        System.out.println(" Human fold ");
    }

    @Override
    public void unfold() {
        System.out.println(" Human is unfolding ");
    }

    @Override
    public void rollable() {

    }

    @Override
    public void rollForwad() {

    }
}
