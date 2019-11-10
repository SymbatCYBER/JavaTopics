package Random;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validUser = " test";
        String validPass = "test123";
        System.out.println(" enter your name ");
        String loginUser = input.nextLine ();


        if (loginUser.equals((validUser))) {
            System.out.println( " enter your password ");
            String loginPass = input.nextLine();

            if (loginPass.equals(validPass)){
                System.out.println("Welcome ");

            }else {
                System.out.println(" invalid password ");
            }
        }else {
            System.out.println(" invalid username ");
        }



    }
}
