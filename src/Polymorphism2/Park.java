package Polymorphism2;

public class Park {
    public static void main(String[] args) {
        GermanShephard dog = new GermanShephard(); // be yourself
        Dog dog1= new GermanShephard();  /// first level
        Animal dog2 = new GermanShephard(); // above level



       GermanShephard dog3 =( GermanShephard) dog; //downCasting

     Animal joe = new GermanShephard();
     Dog joe2 =  (Dog)joe;
     GermanShephard joe3 = (GermanShephard)joe2;
     Trainable joe4 = (Trainable) joe3;









    }
}
