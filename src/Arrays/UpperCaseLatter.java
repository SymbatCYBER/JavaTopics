package Arrays;

public class UpperCaseLatter {
    public static void main(String[] args) {

        String []  items ={"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count =0;


     for (  String   item: items  ) {

         char stars = item.charAt(0);
         if (Character.isUpperCase(stars)){
             count++;

             System.out.println(item);



         }

     }


        System.out.println(count);






    }
}
