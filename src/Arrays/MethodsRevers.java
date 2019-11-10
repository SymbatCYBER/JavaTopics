package Arrays;

public class MethodsRevers {
    public static void main(String[] args) {
        //String rev = "";
                System.out.println(MethodsRevers("java is fun"));

    }


    public static String MethodsRevers(String name) {
        String rev = " ";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        return rev;
    }


}
