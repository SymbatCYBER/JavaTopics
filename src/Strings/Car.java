package Strings;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {


        String cars = " Toyota, BMW, Juguar";

        if (cars.isEmpty()) {
            System.out.println("  No cars in your  garage ");


        }
        if (cars.contains(" Toyota") || cars.contains("Nissan")) {
            System.out.println(" a Japanese car in your garage ");

        }
        if (cars.contains(" BMW")) {
            System.out.println("German cars");

        }
        if (cars.contains(" Maserati")) {
            System.out.println(" there is Italian car i n your garage ");
        }
        if (cars.contains("Jugur")) {
            System.out.println("there is a Britsh car");



            }else {
            System.out.println("no british cars");
        }


        }
    }
