package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {
    public static  ArrayList<String>getStringList(){
        ArrayList<String>words= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("Enter your word ");
            words.add(scanner.nextLine());
            System.out.println("are you done? y/n");
            if (scanner.nextLine().equals("y")){
                break;
            }
        }
        return words;
    }

    public static ArrayList<String> filterList(ArrayList<String> words, int size){
        ArrayList<String>newWords = new ArrayList<>();
        for (String s: words ){
            if (s.length()==size){
                newWords.add(s);
            }
        }
        return newWords;
    }

    public static ArrayList<String>removeDuplicates(ArrayList<String> words){
        ArrayList<String> newWords= new ArrayList<>();
        for(String s: words){
            if(newWords.contains(s)){
                continue;
            }
            newWords.add(s);

        }
        return newWords;
    }
}
