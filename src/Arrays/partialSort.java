package Arrays;

public class partialSort {
    public static void main(String[] args) {
        int [] grads={15,25,33,35,66,44,78,95,98,1,500};
        int max=grads[0];
        int min=grads[0];
        for(int i=0; i<grads.length;i++){
           if(max<grads[i]) {
               max=grads[i];
           }
           if(min>grads[i]){
               min=grads[i];
           }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
