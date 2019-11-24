package IifElseStatements;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 System.out.println(" enter your mass in kg");
        System.out.println(" enter your mass in kg");


        double mass = input.nextDouble();
        System.out.println(" enter your height  in cm");
        double height = input.nextDouble();
        double bmi = mass / (height * height);
        if (bmi < 18.5) {
            System.out.println(" underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println(" normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println(" over weight");

        } else {
            System.out.println(" Obese");
        }


    }


    }
