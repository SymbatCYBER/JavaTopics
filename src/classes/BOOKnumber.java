package classes;

import java.util.Scanner;

public class BOOKnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many books do you have");
        int numOfBooks = input.nextInt();
        input.nextLine();
        BOOK[] library = new BOOK[numOfBooks];
        for (int i = 0; i < library.length; i++) {

            System.out.println("Enter the title of book " + (i + 1));
            String title = input.nextLine();
            System.out.println("Enter the author of book " + (i + 1));
            String author = input.nextLine();
            System.out.println("Enter the number of pages of book " + (i + 1));
            int pages = input.nextInt();
            input.nextLine();
//            Book eachBook = new Book(title,author,pages);
//            library[i] = eachBook;
            library[i] = new BOOK(title, author, pages);
        }
        for (BOOK book : library) {
            System.out.println(book.name);


        }

    }

}