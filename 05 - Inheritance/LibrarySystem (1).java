public class LibrarySystem {
    static class Book {
        protected String title;
        protected int publicationYear;
        public Book(String title, int publicationYear) {
            this.title = title;
            this.publicationYear = publicationYear;
        }
        public void displayInfo() {
            System.out.println("Title: " + title + ", Year: " + publicationYear);
        }
    }

    static class Author extends Book {
        private String name;
        private String bio;
        public Author(String title, int publicationYear, String name, String bio) {
            super(title, publicationYear);
            this.name = name;
            this.bio = bio;
        }
        @Override
        public void displayInfo() {
            System.out.println("Book: " + title + ", Year: " + publicationYear + ", Author: " + name + ", Bio: " + bio);
        }
    }

    public static void main(String[] args) {
        Author a1 = new Author("The Silent Observer", 2020, "Jane Doe", "Award-winning mystery writer.");
        Author a2 = new Author("Digital Dreams", 2022, "John Smith", "Tech journalist and novelist.");
        a1.displayInfo();
        a2.displayInfo();
    }
}
