interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // Veg items have no additional charges
    }
}

class NonVegItem extends FoodItem {
    private static final double NON_VEG_ADDITIONAL_CHARGE = 2.5;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_ADDITIONAL_CHARGE; // Non-veg items have additional charges
    }
}

class DiscountableVegItem extends VegItem implements Discountable {
    private double discountPercentage;

    public DiscountableVegItem(String itemName, double price, int quantity, double discountPercentage) {
        super(itemName, price, quantity);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void applyDiscount() {
        double discountAmount = (getPrice() * discountPercentage) / 100;
        double newPrice = getPrice() - discountAmount;
        setPrice(newPrice);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountPercentage + "%";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Pizza", 8.5, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 5.5, 3);
        DiscountableVegItem discountableVegItem = new DiscountableVegItem("Paneer Tikka", 7.0, 1, 10);

        vegItem.getItemDetails();
        System.out.println("Total Price: " + vegItem.calculateTotalPrice() + "\n");

        nonVegItem.getItemDetails();
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice() + "\n");

        discountableVegItem.getItemDetails();
        discountableVegItem.applyDiscount();
        System.out.println(discountableVegItem.getDiscountDetails());
        System.out.println("Total Price after Discount: " + discountableVegItem.calculateTotalPrice() + "\n");

        FoodItem[] foodItems = {vegItem, nonVegItem, discountableVegItem};
        double totalOrderPrice = 0;

        for (FoodItem item : foodItems) {
            totalOrderPrice += item.calculateTotalPrice();
        }

        System.out.println("Total Order Price: " + totalOrderPrice);
    }
}
