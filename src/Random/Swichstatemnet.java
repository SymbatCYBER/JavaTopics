package Random;

import java.util.Scanner;

public class Swichstatemnet {
    public static void main(String[] args) {
        Scanner input = new  Scanner ( System.in);
        System.out.println(" Enter number of babis");

        int numberOfBabies = input.nextInt();

        switch (numberOfBabies){
            case 0:
                System.out.println( " Sorry");
                break;
            case 1:
                System.out.println(" good for you");
            case 2:
                System.out.println(" wow. twins");
            case 3:
                System.out.println(" wow. triplets");
                break;
            case 4 :
            case 5:
            case 6:

                System.out.println("unbleveble " + numberOfBabies + " babes");
                break;
            default:
                System.out.println(" hh");
        }









    }
}
