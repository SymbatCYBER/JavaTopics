package OVerriding;

public class CheckingAccount  extends  BanKAccountPublic{

        @Override

       public void transfer(double num) {
            double total = num +(num*0.05);


           if(this.balance>=total){
               System.out.println(" success trans ");
               this.balance-=total;

           }else {
               System.out.println("Balance not enough");
           }
        }






    }



