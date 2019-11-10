package Increamant;

import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);

        System.out.println( " enter your six numbers" );
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();
        int number4=input.nextInt();
        int number5=input.nextInt();
        int number6=input.nextInt();
         int money = number1+number2+number3+number4+number5+number6;
         int spend = money/3;
         int remaider = money-spend;

        System.out.println(" it was my money" + money);
        System.out.println(" how much i spend " + spend );
        System.out.println(" rest of your money"  + remaider);
















    }
}
