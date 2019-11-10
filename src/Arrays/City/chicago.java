package Arrays.City;

public class chicago {
    public static void main(String[] args) {



      String[] citis = {"Chicago"," New YORK",  "Madison", "Washington"};
      boolean check= false ;
      int count  =0;

      for (String city:  citis) {
      if (city.equalsIgnoreCase("Chicago"))  {

          check = true;
          count ++;

      }

      }
        if(check) {
            System.out.println("Windy city found " + count + " times");
        } else {
            System.out.println("Windy city not found");
        }
        }



    }

