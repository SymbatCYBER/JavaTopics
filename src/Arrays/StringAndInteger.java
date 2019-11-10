package Arrays;

public class StringAndInteger {


    public static void main(String[] args) {
        int [] arr2 = {-1,3,-4,-2,32,2,-23,1};
        negativeNumbers(arr2);
//        equalLengths("names", 4);
//    }
//
//    public static void equalLengths(String str, int len) {
//        if (str.length() == len) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");
 }
        public static void negativeNumbers ( int [] arr ){
        for (int num :arr){
          if (num<0) {
              System.out.println(num);
          }


            }

        }

}