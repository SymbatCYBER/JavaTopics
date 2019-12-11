package Arrays;

public class ArraysReverse {
    public static void main(String[] args) {
       String  rev=" we went to picnic";
       String word="";

       for (int i=rev.length()-1; i>=0; i--){
       word +=rev.charAt(i);
       }
        System.out.println("reversed sentence is: "+ word );
    }
}
