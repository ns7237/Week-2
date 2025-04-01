import java.util.ArrayList;
import java.util.List;
public class EcommercePlatform {
    static class Product {
        private String name;
        private double price;
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }
    }
    static class Order {
        private int orderId;
        private List<Product> products;
        public Order(int orderId) {
            this.orderId = orderId;
            this.products = new ArrayList<>();
        }
        public void addProduct(Product product) {
            products.add(product);
        }
        public double calculateTotal() {
            double total = 0;
            for (Product product : products) {
                total += product.getPrice();
            }
            return total;
        }
        public void listProducts() {
            System.out.println("Products in Order #" + orderId + ":");
            for (Product product : products) {
                System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }
        }
        public int getOrderId() {
            return orderId;
        }
    }
    static class Customer {
        private String name;
        private List<Order> orders;
        public Customer(String name) {
            this.name = name;
            this.orders = new ArrayList<>();
        }
        public void placeOrder(Order order) {
            orders.add(order);
            System.out.println(name + " placed an order with Order ID #" + order.getOrderId());
        }
        public void listOrders() {
            System.out.println(name + "'s Orders:");
            for (Order order : orders) {
                order.listProducts();
                System.out.println("Total Price: $" + order.calculateTotal());
                System.out.println("---");
            }
        }
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 799.49);
        Product product3 = new Product("Headphones", 199.99);
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Order order1 = new Order(101);
        Order order2 = new Order(102);
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);
        System.out.println("\n=== Customer Orders ===");
        customer1.listOrders();
        customer2.listOrders();
    }
}
