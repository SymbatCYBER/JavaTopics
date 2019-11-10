package Arrays.methods;



public class methodSubstring {
    public static String [] increaseArray(String [] arr, String word, int index) {
        String [] newArr = new String[arr.length+1];
        for(int i=0, j= 0; j < newArr.length; j++)  {
            if(index == j) {
                newArr[j] = word;
            } else {
                newArr[j] = arr[i];
                i++;
            }
        }
        return  newArr;
    }





}
