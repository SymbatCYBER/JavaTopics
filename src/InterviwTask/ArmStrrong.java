package InterviwTask;

public class ArmStrrong {

    public static void main(String[] args) {

    }




    public static boolean isArmStrong(int number){
        String num= number + " ";
        int power=num.length();
        int sum =0;
        for(int i=0; i<num.length(); i++){

            int digit = Integer.parseInt(num.charAt(i)+"");
            //digit ^ power--
            //153
            //1^3=1*1*1
            //5^3=5*5*5
            sum+=Math.pow(digit,power);

        }
       return sum==number;



    }
}
