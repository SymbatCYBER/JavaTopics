package classes;

public class BOOK {

    String name;

    String author;

    int pages;
    public  BOOK(){

    }
    public BOOK(String name, String author,int pages){
        this.name=name;
        this.author=author;
        this.pages=pages;
    }
   public void info(){
       System.out.println("name " + this.name );
       System.out.println("Author " + this.author );
       System.out.println("Pages " + this.pages );
       System.out.println();
   }




}
