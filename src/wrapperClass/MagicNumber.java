package wrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {

//    Create a class MagicNumber
//Instance variable list of integers.
//    create a method generateNumbers. This method should accept integer
//    for size and it needs to generate given size random numbers and store in list of integers.
//    Collapse

ArrayList<Integer>numbers = new ArrayList<>();



  public  void generateNumbers(int size ) {
      Random random = new Random();
      for (int i = 0; i < size; i++) {
          numbers.add(random.nextInt(1000));
      }
  }

     public void generateEvens(int size ) {
          Random in = new Random();
         while (true){
             int i=in.nextInt(100);
             if(i%2==0){
                 numbers.add(i);
             }
             if(numbers.size()==size){
                 break;
             }
         }


          }






      }




