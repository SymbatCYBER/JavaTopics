package IifElseStatements;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);

        System.out.println( "Enter  a number ");
        int user = input.nextInt();

        switch  (user) {

            case 1:
                System.out.println(" one ");
                break;
            case 2:

                System.out.println("two");
                break;
            case 3:
                System.out.println( "tree");
                break;
            case 4:
                System.out.println( " four");
                break;
            case 5:
                System.out.println( " five ");
                break;
            case 6:
                System.out.println( " six");
                break;
            case 7:
                System.out.println(" seven");
                break;
            case 8:
                System.out.println( " eight");
                break;
            case 9:
                System.out.println( "nine");
                break;
             default:
                System.out.println(" invalid number");




        }










         }
    }

