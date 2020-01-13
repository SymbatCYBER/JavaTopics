package ExceptionsPAC;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecptionExampleTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );
        int [] numbers= {1,2,3,4,5};


        try{
            System.out.println(" enter the index of your elements ");
            int indexOfElements=scanner.nextInt();
            scanner.nextLine();
            System.out.println(" enter the number that you want to add ");
            int number = scanner.nextInt();
            numbers [indexOfElements] = number;

        }catch(InputMismatchException e ){
            System.out.println(" Invalid numbers is entered ");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" entered an invalid index ");
        }finally {
            System.out.println(Arrays.toString(numbers));
        }
    }





}
