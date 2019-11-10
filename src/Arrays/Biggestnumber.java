package Arrays;
import java.util.Arrays;
public class Biggestnumber {
    public static void main(String[] args) {

     int []  small ={ 3,30,14,6,50,20};

        int max  = small[0];

        for (int i = 1; i < small.length; i ++){

            if (small [i] > max  ) {
                max = small[i];
            }
            System.out.println(max);

        }











    }
}
