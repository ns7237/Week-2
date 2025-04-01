import java.util.ArrayList;
import java.util.List;
public class ShoppingApp {
    static class Product {
        private String name;
        private double price;
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public double getPrice() {
            return price;
        }
        public String getName() {
            return name;
        }
    }
    static class Customer {
        private String name;
        private List<Product> purchasedProducts;

        public Customer(String name) {
            this.name = name;
            this.purchasedProducts = new ArrayList<>();
        }

        public void purchaseProduct(String productName, double price) {
            Product product = new Product(productName, price);
            purchasedProducts.add(product);
        }

        public List<Product> getPurchasedProducts() {
            return purchasedProducts;
        }

        public String getName() {
            return name;
        }
    }
    static class BillGenerator {
        public double calculateTotal(Customer customer) {
            double total = 0.0;
            for (Product product : customer.getPurchasedProducts()) {
                total += product.getPrice();
            }
            return total;
        }
    }
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");

        customer.purchaseProduct("Laptop", 999.99);
        customer.purchaseProduct("Mouse", 25.50);
        customer.purchaseProduct("Keyboard", 45.00);
        BillGenerator billGenerator = new BillGenerator();
        double total = billGenerator.calculateTotal(customer);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Purchased Products:");
        for (Product product : customer.getPurchasedProducts()) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total Bill: $" + total);
    }
}
