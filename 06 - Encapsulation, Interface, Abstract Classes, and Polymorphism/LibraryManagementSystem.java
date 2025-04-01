interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books are available for 14 days
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines are available for 7 days
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs are available for 3 days
    }
}

class ReservableBook extends Book implements Reservable {
    private boolean available;

    public ReservableBook(String itemId, String title, String author, boolean available) {
        super(itemId, title, author);
        this.available = available;
    }

    @Override
    public void reserveItem() {
        if (available) {
            System.out.println("Item reserved: " + getTitle());
            available = false;
        } else {
            System.out.println("Item not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "Time", "Various Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        magazine.getItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

        dvd.getItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

        ReservableBook reservableBook = new ReservableBook("B002", "1984", "George Orwell", true);
        reservableBook.reserveItem();
        System.out.println("Available for reservation: " + reservableBook.checkAvailability());
    }
}
