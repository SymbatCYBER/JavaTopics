package Constractor;

public class Sky {

    public Sky (String colorCode ) { //
        this.color=colorCode;

    }
    public  Sky (String color, int visibleStars){
        this.color=color;
        this.visibleStars=visibleStars;
    }
    String color;
    int visibleStars;
 public void info(){
     System.out.println("\nColor: " + color);
     System.out.println("Visible Stars: " + visibleStars);
 }


    public static void main(String[] args) {
        Sky reSKy = new Sky ("blue");


        System.out.println(reSKy.color);
        Sky s2 = new Sky ("Yellow ",7);
        s2.info();
    }
}
