package classes;

public class Bookstore {
    public static void main(String[] args) {
       BOOK book1 =new BOOK("java ","cybertek",200) ;//this is how we call methods
        BOOK book2 =new BOOK("java ","cybertek",300);
        BOOK book3 =new BOOK("java ","cybertek",400);


       BOOK [] myBook =new BOOK[3];
       myBook[0]=book1; // 0 means index of 1 one
       myBook[1]=book2;
       myBook[0] .pages=50;// how we change or reassained
        for (BOOK eachBook: myBook){
            eachBook.info();
           // System.out.println(eachBook.name+ "has "+ eachBook.pages+ "pages");
        }
        for (int i=0, j =50; i < myBook.length; i++, j +=100){
            myBook[i].pages= j;

        } for (BOOK eachBook: myBook) {
            eachBook.info();
            //  System.out.println(eachBook.name +  " has " +eachBook.pages + " pages");
        }
        }
    }


