package MutableAndImmutable;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
    }
    public static boolean isPalindrome(String str){


//        Create a static method isPalindrome. Method takes a String and
//    check if the String is palindrome or not. Return true if it
//        is palindrome and false if it is not. Use StringBuilder


        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (str.equals(sb.toString())){
            return true;
        }else {
            return false;
        }





    }
}
