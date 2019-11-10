package scanners;

import java.util.Scanner;

public class Fornow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println( "enter  name of your frends");
        String name1  = input.nextLine();
        String name2 = input.nextLine();
         String name3 = input.nextLine();
        String name4 = input.nextLine();


        System.out.println( " enter their ages");
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int  age3 = input.nextInt();
         int sum = age1+age2+age3;
         int result= sum/3;
        System.out.println(" the result is "+ result );


        int remainder =result%3;
        System.out.println(" normal avg" + remainder);















    }








}
