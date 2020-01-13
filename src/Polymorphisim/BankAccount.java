package Polymorphisim;

public class BankAccount extends PaymentMethod {
    @Override
    public  void charge (double amount){
        System.out.println(" ANOUNT in Bank Account: "+ amount);

    }

    @Override

    public  void refund (double amount ){
        System.out.println(" Amount is refund in Bank Account: " +amount);
    }
}
