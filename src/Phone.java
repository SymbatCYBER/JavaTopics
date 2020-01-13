import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Phone {
    double version;
    String brand;
    int [] numbers;








    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Phone phone = new Phone();


        try{
            System.out.println("enter your verstoin  ");
            phone.version=in.nextDouble();
            in.nextLine();

        }catch(InputMismatchException e){
            System.out.println("invalid version enterd ");
        }
        System.out.println(" Enter your brand ");
        phone.brand=in.nextLine();

        try{
            System.out.println(" how many numbers you want to enter ");
            int [] nums = new int [in.nextInt()];
            for(int i=0; i<nums.length;i++){
                try{
                    System.out.println(" Enter number "+ (i+1));
                    nums [i]=in.nextInt();

                }catch (InputMismatchException e ){
                    System.out.println(" Invalid  num is stored, try another one ");
                    continue;
                }
            }
             phone.numbers=nums;
            System.out.println(Arrays.toString(phone.numbers) );
        }catch (NullPointerException e ){
            System.out.println("");
        }
    }
}
