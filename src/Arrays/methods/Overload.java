package Arrays.methods;

public class Overload {
    public static void main(String[] args) {

    }
    public static boolean checkString(String word, String start, int times) {
        int count = 0;
        for(int i=0; i < word.length() - start.length() + 1 ; i++) {
            String sub = word.substring(i, i + start.length());
            //   System.out.println(sub);
            if(sub.equals(start)) {
                count++;
            }
        }
        if(times == count) return true;
        return false;
    }
    }

