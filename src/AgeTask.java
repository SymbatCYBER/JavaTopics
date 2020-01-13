import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in );

        System.out.println(" enter your name ");
        String name = in.nextLine();
        int age=0;

        try{
            System.out.println(" Enter your age ");
            age =in.nextInt();

        }catch (InputMismatchException e ){
            System.out.println(" invalid age exception ");
        }

        System.out.println("Name: "+ name);
        System.out.println("Age" + age);
    }
}
