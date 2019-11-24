package classes;

import java.util.Scanner;

public class detaildOFHouse {
    public static void main(String[] args) {
      House myhouse = new House();
      Scanner in =new  Scanner(System.in);

        System.out.println(" please enter house type");
        myhouse.type=in.nextLine();
        System.out.println("please enter your address ");
        myhouse.address=in.nextLine();
        System.out.println("plese enter your number your room");
        myhouse.numRooms=in.nextInt();
       myhouse.info();
    }
}

