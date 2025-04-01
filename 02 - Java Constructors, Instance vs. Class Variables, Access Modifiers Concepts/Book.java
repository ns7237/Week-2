class Book{
    String title;
    String author;
    double price;
    public Book(){
        this.title = "Unknown title.";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookInfo(){
        System.out.println("Ttile: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args){
        Book book1 = new Book();
        System.out.println("Book 1 Details:");
        book1.displayBookInfo();
        Book book2 = new Book("Java Programming", "James Gosling", 599.99);
        System.out.println("\nBook 2 Details: ");
        book2.displayBookInfo();
    }
}



