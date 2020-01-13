package ExceptionsPAC;

public class FinalyeX {

    public static void main(String[] args) {
        String s="";

        try{

            s =" Cybertek";
            System.out.println(s.substring(10));
            System.exit(0);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(" index doesn't  exist");
            System.exit(0);
        }finally {
            System.out.println("The string was "+ s);// why we use
        }
    }
}
