package classes;

public class Car {

    String mersedes;
    int year;
    boolean edition;
    int maileage;

    public void   drive(){
        System.out.println(year+ " " + mersedes + " is driving " );
        maileage+=10;

    }
     public void drive(String destiation) {
         System.out.println(year+ " " + mersedes + "is driving to "+ destiation);
         this.maileage+=10;
     }
     public void drive (int mile){
         System.out.println(this.year +" "+ this.mersedes+ "is driving to  " +mile + "miles ");
         maileage=mile;
     }
}
