package Arrays.methods;

public class ResultOfGoogle {
    public static void main(String[] args) {






        System.out.println(resultCount("About 94,500,000 results (0.62 seconds)"));
    }
    public static String resultCount(String str){
        String [] words = str.split("\\(");
        String seconds = words[1];
        return seconds.replaceAll("\\)","");
    }
}
