package MutableAndImmutable;

public class RemoveString {
    public static void main(String[] args) {
        System.out.println(deleteWord("this is out con"));
    }
    public static String deleteWord(String str){
      StringBuilder sb = new StringBuilder(str);

      int index =sb.indexOf("con");

      if(index>0){
          sb.delete(index,index+3);
      }
      return sb.toString();
    }


    public static String deleteWord(String first, String second) {
        StringBuilder sb = new StringBuilder(first);

        int index = sb.indexOf(second);
        if (index >= 0) {
            sb.delete(index, index + second.length());
        }return sb.toString();
    }
}
