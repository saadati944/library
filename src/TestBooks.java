import java.util.Scanner;

public class TestBooks {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        BooksDB books = new BooksDB();
        System.out.printf("What do you want to do? " + "\n"+
                "-search // to see if a book exits or not" +"\n"+
                "-book // to get information about a book" +"\n"+
                "-all // to get a list of all books in the library" +"\n"+
                "-get  // to borrow a book"+"\n");
        String operation = in.nextLine();
        if (operation.equals("-search")) {
            System.out.printf("Enter the books name ");
            String book = in.nextLine();
            for (int i = 0; i < books.booksDb.size(); i++) {

            }
        }
    }
}