public class Main1 {

    // Book class
    static class Book {
        public String ISBN;          // Public member
        protected String title;      // Protected member
        private String author;       // Private member

        // Constructor
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        // Getter for author
        public String getAuthor() {
            return author;
        }

        // Setter for author
        public void setAuthor(String author) {
            this.author = author;
        }

        // Display method
        public void displayBookInfo() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    // EBook subclass
    static class EBook extends Book {
        private double fileSize;  // Size in MB

        public EBook(String ISBN, String title, String author, double fileSize) {
            super(ISBN, title, author);
            this.fileSize = fileSize;
        }

        public void displayEBookInfo() {
            System.out.println("E-Book ISBN (public): " + ISBN);
            System.out.println("E-Book Title (protected): " + title);
            System.out.println("File Size: " + fileSize + " MB");
        }
    }

    // main method
    public static void main(String[] args) {
        // Create a Book object
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookInfo();

        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());

        System.out.println();

        // Create an EBook object
        EBook eb1 = new EBook("978-0134685991", "Effective Java (E-Book)", "Joshua Bloch", 2.5);
        eb1.displayEBookInfo();
    }
}
