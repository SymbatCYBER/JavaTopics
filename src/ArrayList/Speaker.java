package ArrayList;

import java.util.ArrayList;

public class Speaker {
    public static void main(String[] args) {
//        ArrayList <String>  names = new ArrayList<>();
//        names.add ("Jason");
//        names.add("Adam");
//        names.add (1,"John");
//        System.out.println(names);
//        System.out.println(names.get(2));
// How to use list for any Object.
        ArrayList<Cat> catsForSale = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.color = " White";
        cat1.age = 3;
        catsForSale.add(cat1);


        Cat myCat = new Cat();
        myCat.color = "black";
        myCat.age = 5;
        catsForSale.add(myCat);

        System.out.println(catsForSale.size());


        for (int i = 0; i < catsForSale.size(); i++) {
            System.out.println(" color # " + (i+1)+ catsForSale.get(i).color);
            System.out.println(" age " + catsForSale.get(i).age);
            System.out.println();
        }



    }




}
