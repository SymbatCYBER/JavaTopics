package OVerriding;

public class BanKAccountPublic {
 public double balance;
 public int accountNumbers;
  public String name;


  public void   info(){
      System.out.println("Name: "+this.balance);
      System.out.println("Account num: "+this.accountNumbers);
      System.out.println("Balance "+this.name);

  }
   public void  transfer(double num){
       System.out.println(" Money Transfer"+num);
       this.balance-=num;
       this.balance-=(num*0.1);
   }

   public  void deposit (double numbers ){
      this.balance+=numbers;
       System.out.println(" deposit ");
   }
@Override
    public String toString(){
      String result = "Name: " + this.name+ "\n Account number " + this.accountNumbers + "\nBalance: " + this.balance;
      return result;
}


}
