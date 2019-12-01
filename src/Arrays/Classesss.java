package Arrays;

public class Classesss {

    public static void main(String[] args) {

        System.out.println(uniqueChars("sooooon"));
    }



        public static String uniqueChars(String str) {
            //TODO: write your below
            String word = "" ;

            for (int i =0; i<str.length(); i++){
                if(word.indexOf(str.charAt(i))==-1){
                    word=word+str.charAt(i);
                }
            }
            return word;
        }
    }

