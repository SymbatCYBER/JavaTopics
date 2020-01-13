package OVerriding;

public class SavingAccount extends BanKAccountPublic {
    public double interestIncome;

    @Override
    public void transfer(double num) {
        this.balance -= num;
        this.balance -= (num * 0.2);

    }

    @Override
    public void info() {
        super.info();
        System.out.println("interest income : " + interestIncome);

    }


    public void calculateAnnualInterestIncome() {

        interestIncome += this.balance * 0.03;

    }



}
