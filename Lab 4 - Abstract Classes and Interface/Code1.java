package lab4;
import java.util.*;

interface BookInfo {
    void accept();
}

interface SalesInfo {
    void read_sales();
}

class BookSales implements BookInfo, SalesInfo {
    int year, cost, copies, temp = -1;
    String name, language, store, purchase, author;
    Scanner sc = new Scanner(System.in);
    void accept() {
        System.out.print("Enter the Name of book: ");
        name = sc.nextLine();
        System.out.print("Enter the Year of book: ");
        year = sc.nextInt();
        System.out.print("Enter the Cost of book: ");
        cost = sc.nextInt();
        String temp = sc.nextLine();
        System.out.print("Enter the Author of book: ");
        author = sc.nextLine();
        System.out.print("Enter the Language of book: ");
        language = sc.nextLine();
    }
    void read_sales() {
        System.out.print("Enter the Name of store: ");
        store = sc.nextLine();
        System.out.print("Enter the Number of copies: ");
        copies = sc.nextInt();
    }
    void purchase(BookSales b1[], int num) {
        System.out.print("Enter the Book Name(Purchase): ");
        purchase = sc.nextLine();
        for (int i = 0; i < num; i++) {
            if (purchase.equals(b1[i].name)) {
                temp = i;
                break;
            }
        }
        if (temp == -1)
            System.out.println("This book is not present");
        else {
            BookSales b2 = b1[temp];
            for (int i = temp; i > 0; i--) {
                b1[i] = b1[i - 1];
            }
            b1[0] = b2;
        }
        return b1;
    }
}
public class Lab4 {
    public static void main(String[] args) {
        System.out.print("Enter the number of books: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BookSales b1[] = new BookSales[num];
        for (int i = 0; i < num; i++) {
            b1[i] = new BookSales();
            b1[i].accept();
            b1[i].read_sales();
        }
        boolean cont = true;
        while (cont) {
            BookSales b2 = new BookSales();
            b2.purchase(b1, num);
            System.out.print("Do you wish to continue? (1: Yes | 0: No) ");
            int t = sc.nextInt();
            cont = (t == 1) ? true : false;
        }
        System.out.println("Printing Last Modified Sequence: ");
        for (int i = 0; i < num; i++) {
            System.out.println(b1[i].name);
        }
    }
}