class Book1 {
    String title;
    String author;
    double price;
    boolean isAvailable;
    public Book1(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have borrowed: " + title);
            isAvailable = false;
        } else {
            System.out.println("Sorry, " + title + " is already borrowed.");
        }
    }
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Book1 book1 = new Book1("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);
        Book1 book2 = new Book1("1984", "George Orwell", 12.50, false);
        System.out.println("Book 1 Details:");
        book1.displayBook();
        System.out.println("\nTrying to borrow Book 1...");
        book1.borrowBook();
        book1.displayBook();
        System.out.println("\nTrying to borrow Book 1 again...");
        book1.borrowBook();
    }
}

