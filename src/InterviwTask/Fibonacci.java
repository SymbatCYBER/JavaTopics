package InterviwTask;

import java.util.ArrayList;
import java.util.Arrays;



    public class Fibonacci {


        public static void main(String[] args) {
        }
        public static void beFibonacci(int N) {
            int num1 = 0;
            int num2 = 1;
            System.out.println("The first" + N + " numbers of Fibonacci  are");
            for (int i = 0; i < N; i++) {
                System.out.print(num1 + " - ");
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
        }
        public static String allFibonacciInRange(int range){
            int [] arr = new int [range];
            arr[0]=0;
            arr[1]=1;
            for (int i=2; i< arr.length;i++){
                arr[i]=arr[i-1] + arr[i-2];
            }
            return Arrays.toString(arr).replace("[","").replace("]","").replace(",","");
        }


    }
