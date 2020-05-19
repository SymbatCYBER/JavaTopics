package avatars;

import java.util.ArrayList;

public class noTriples {

    public static void main(String[] args) {
        System.out.println(noTripples(testData(1,1,1,4,5)));
    }


    public static  boolean noTripples(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size()-2; i++) {

            if(nums.get(i)==nums.get(i+1)){
                if(nums.get(i)==nums.get(i+2))
                return false;
            }


        }

return true;
    }




    public static ArrayList<Integer> testData (int ... nums) {
        ArrayList <Integer> list =  new ArrayList<>();
        for(int num: nums) {
            list.add(num);
        }
        return list;
    }

}