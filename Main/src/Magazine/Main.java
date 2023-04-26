package Magazine;

import Book.Author;
import Book.Book;

public class Main {
    public static void main(String[] args) {

        printedProduct[] products = new printedProduct[]{
                new BookTwo("Война и мир", 1300, "лалалала", "Лев Толстой"),
                new Magazine("Cool", 1300, "Celebryties")
        };

        for (int i = 0; i < products.length; i++) {
            printedProduct p = products[i];

            p.printContent();

            
        }

    }
}
