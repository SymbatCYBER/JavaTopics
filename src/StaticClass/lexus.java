package StaticClass;

public class lexus {
    String model;
    int year;
    String color;
    double mileage;
    boolean isNew;
    double price;
    static int  totalNumOfLexus;

    public lexus(String model, int year){
        this.model=model;
        this.year=year;
       totalNumOfLexus++;
    }

       public   static  double mileToKm(double miles ){

        return miles*1.6;
}

public static void evaluated (lexus car){
        int age =2019 -car.year;
        if (car.mileage<50000 && age<=3 ){
            System.out.println("Best choice");
        }else if (car.mileage>=50000 && car.mileage <100000 && age >=3 && age <7){
            System.out.println("Fair choice ");
        }else if (car.mileage>=100000 && car.mileage<200000){
            System.out.println("you decided ");
        }else if (car.mileage>=200000){
            System.out.println("Stay away");
        }else {
            System.out.println("not able to evaluated");
        }
}





}
