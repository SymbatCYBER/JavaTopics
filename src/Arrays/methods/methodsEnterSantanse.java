package Arrays.methods;

import java.lang.reflect.Array;
import java.util.Scanner;

public class methodsEnterSantanse {

    public static void main(String[] args) {
      //countWords();
       // login();
    }


 public static  void login ( ){

      Scanner in = new Scanner(System.in);
      String expectedid= " jhonejava";
      String expectedPassword="123456";
     System.out.println(" weclome to this side you have  click the login button ");
     System.out.println("plese enter your ");
      String actualUser=in.nextLine();
     System.out.println(" plese enter password");
     String actualPassword = in.nextLine();
     //4- Check if the expected username and actual username are matching
     //5- Print out final message
     if(expectedid.equalsIgnoreCase(actualUser) && expectedPassword.equals(actualPassword)){
         System.out.println("You have logged in!");
     }else{
         System.out.println("Either your username or password is not matching!");
     }

 }






//    public static void countWords(){
//        System.out.println("plese enter senternse to be analized ");
//        Scanner in = new Scanner(System.in);
//       String sentense  = in.nextLine();
//        String [] words= sentense.split(" ");
//        System.out.println("words ");
//        System.out.println("Number of words in this sentence are: " + words.length);
//
//



    }





