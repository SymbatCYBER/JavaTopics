package Polymorphisim;

public class CreditCart extends  PaymentMethod {


    @Override
    public void charge(double amount) {
        System.out.println(" amount " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println(" refund: " + amount);
    }
}
