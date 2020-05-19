package CollectionFrameWork;

import java.util.*;

public class TaskForCollection {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbers ");

        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int a =in.nextInt();
            number.add(a);
        }




        Iterator<Integer> it = number.iterator();


       while (it.hasNext()){
          int num =it.next();
          if(num%2==1){
              it.remove();
          }
       }
       }

        }


