public class Book {
    static String libraryName = "OpenAI Central Library";
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    private String title;
    private String author;
    private final String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        Book.displayLibraryName();
        System.out.println();
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
