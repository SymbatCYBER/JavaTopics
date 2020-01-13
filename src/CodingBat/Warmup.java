package CodingBat;

public class Warmup {
    public static void main(String[] args) {


        System.out.println(doubleX("xaxxx"));
    }

   /* Given a string, return true if the first instance of "x"
    in the string is immediately followed by another "x".
*/

    /*doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true




*/
    public static boolean doubleX(String str) {
        //boolean check = false;
        if (str.charAt(0) != 'x') {

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                    return true;
                }
            }
        }
        return false;
    }
}