public class Exeptions {
    public static void main(String[] args) {
        //String s=" Hello";
      //  System.out.println( s.charAt(10));


        try{
            String s = " hello";
            System.out.println(s.charAt(10));
        }catch(Exception e){
            System.out.println(" exep is thrown ");
        }catch (AbstractMethodError e ){
            System.out.println("invalid math");
        }


        System.out.println(" the end ");
    }
}
