package Random;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();


        if (message.isEmpty()){
            System.out.println( " Message is empty");

        }else  if (message.length() >=10){
            System.out.println(" Message id good");
        }else {
            System.out.println("Message too  short");
        }





    }
}
