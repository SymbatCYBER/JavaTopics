package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class binarySerachEx {
    public static void main(String[] args) {
        String [] groceryList={"apple", "carrot","orange","cherry", "strawberry" };
        Arrays.sort(groceryList);
        System.out.println("index number of appiles: "+ Arrays.binarySearch(groceryList,"apple"));
        System.out.println("index number of orange:"+ Arrays.binarySearch(groceryList,"orange"));
    }

}
