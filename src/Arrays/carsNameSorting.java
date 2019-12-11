package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class carsNameSorting {
    public static void main(String[] args) {
//        String [] carBrands ={"mersedes", "bmw", "toyota", "ferrary"};
//       for(String car: carBrands){
//           if(car.equalsIgnoreCase("mersedes")){
//               System.out.println(car+":luxury -comfort");
//           }else if(car.equalsIgnoreCase("bmw")){
//
//               System.out.println(car+"very fast");
//           }else if(car.equalsIgnoreCase("toyota")){
//               System.out.println(car+"good car");
//           }else if(car.equalsIgnoreCase("ferrary")){
//               System.out.println(car+"too expensive");
//           }
//       }

String  shows[]= {"Games of Throns", "Frands", "prison break", "Doctor who", " Creys Anotomy"};
Arrays.sort(shows);
        System.out.println("sorted list of shows");

for(int i =0; i<shows.length;i++){
    System.out.println("#"+i+ " "+shows[i]);
}

}



    }

