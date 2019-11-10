package Random;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {


        Scanner input = new Scanner( System.in);
        System.out.println(" Enter your age ");
        int age = input.nextInt();

        if ( age < 0 || age > 100) {
            System.out.println(" Not a valid age ");
        } else if ( age>=30 ){
            System.out.println(" WELCOME to the building");
        } else if (age<=16){
            System.out.println(" Sorry! try again when you are  30");
        }
else {
            System.out.println(" sorry");
        }

    }
}
