package Arrays.methods;

public class groupWork {
    public static void main(String[] args) {
    int [] arr = {2,4,4,23,81,4};
                    System.out.println(secondLargestNum(arr));
                }
                public static int secondLargestNum ( int[] arr){
                    int h = 0;
                    int s = 0;

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > h) {
                    s = h;
                    h = arr[i];
                } else if (arr[i] < h && arr[i] > s) {
                    s = arr[i];
                }
            }
            return s;
        }




}


