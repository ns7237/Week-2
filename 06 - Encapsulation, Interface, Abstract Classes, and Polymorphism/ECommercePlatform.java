interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    private double discountRate;

    public Electronics(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18%): " + calculateTax();
    }
}

class Clothing extends Product implements Taxable {
    private double discountRate;

    public Clothing(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (12%): " + calculateTax();
    }
}

class Groceries extends Product {
    private double discountRate;

    public Groceries(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("P001", "Laptop", 1000, 0.1);
        Clothing clothing = new Clothing("P002", "T-shirt", 50, 0.2);
        Groceries groceries = new Groceries("P003", "Apples", 30, 0.05);

        Product[] products = {electronics, clothing, groceries};

        for (Product product : products) {
            double finalPrice = product.getPrice() + (product instanceof Taxable ? ((Taxable) product).calculateTax() : 0) - product.calculateDiscount();
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price: " + finalPrice);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println();
        }
    }
}
