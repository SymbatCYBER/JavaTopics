package scanners;

import javax.swing.*;
import java.util.Scanner;

public class Wall {


    public static void main (String[] args) {




        Scanner input = new Scanner(System.in);
        System.out.println( " What is the  wall color");
String color = input.nextLine();
        System.out.println(" What is the  lenght");
        int lenght = input.nextInt();
        System.out.println( "Is is god one ? ");
        String answer =input.nextLine();
        System.out.println("color " + color);
        System.out.println("lenght" + lenght);
        System.out.println("good ? " + answer);






    }





}
