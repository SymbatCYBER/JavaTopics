package Polymorphisim;

public class PayPal extends  PaymentMethod {


    @Override
    public void charge(double amount) {
        System.out.println(" Amount  is applyed: " +amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println(" Amount is refund ");
    }
}
