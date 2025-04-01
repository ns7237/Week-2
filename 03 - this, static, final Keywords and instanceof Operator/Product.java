public class Product {
    static double discount = 10.0;
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }
    private String productName;
    private double price;
    private int quantity;
    private final int productID;
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Price: $" + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        } else {
            System.out.println("Invalid product object.");
        }
    }
    private double getDiscountedPrice() {
        return price - (price * discount / 100);
    }
    public static void main(String[] args) {
        Product product1 = new Product("Wireless Mouse", 25.00, 2, 1001);
        Product product2 = new Product("Bluetooth Headphones", 80.00, 1, 1002);
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        Product.updateDiscount(15.0);
        System.out.println();
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
