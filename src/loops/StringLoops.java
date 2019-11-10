package loops;

import java.util.Scanner;

public class StringLoops {
    public static void main(String[] args) {
//        ) Write a program for the login to application.
//        Program should ask for the password until user hits right password.
//                password is "secret478". If user enters right password print "Welcome to your profile!" and exits the infinite loop
        Scanner input = new Scanner(System.in);




            for (;;){
                System.out.println(" Enter your password ");
        String password = "secret478";
         String user  = input.nextLine();
        if (password.equals(user)  ){
            System.out.println(" Welcome  to your profile ");
            break;
        }

        }







    }
}
