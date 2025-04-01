import java.util.ArrayList;
import java.util.List;
public class LibrarySystem {
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }
        public String getAuthor() {
            return author;
        }
        @Override
        public String toString() {
            return "\"" + title + "\" by " + author;
        }
    }
    static class Library {
        private String name;
        private List<Book> books;
        public Library(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }
        public void addBook(Book book) {
            books.add(book);
        }
        public void showBooks() {
            System.out.println("Books in " + name + ":");
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);
        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);
        cityLibrary.showBooks();
        System.out.println();
        schoolLibrary.showBooks();
    }
}
