package CodingBat;

public class FirstTwoLastTwo {

    public static void main(String[] args) {
        System.out.println(last2("hixxhixx"));

    }

    public static int last2(String str) {

        int count2 = 0;
        int count = 0;
        int count3 =0;
         String a = str.substring(0,2);
         String b = str.substring(str.length()-2);

//         if (!a.equalsIgnoreCase(b)) {
//
//             if ((str.substring(3)).contains(a)) {
//
//
//                 if ((str.substring(0, str.length() - 2)).contains(b)) {
//                     count2++;
//                 }
//             }
//         }
        System.out.println(b);


        for (int i = 0; i < str.length()-2; i++) {

           if (str.substring(i, i+2).equalsIgnoreCase(a) && str.substring(i,i+2).equalsIgnoreCase(b)){
               count++;
           }
        }
        return count;
    }
}
