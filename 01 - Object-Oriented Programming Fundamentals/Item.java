public class Item {
    int itemCode;
    String itemName;
    double price;
    public Item(int code, String name,double itemPrice){
        itemCode = code;
        itemName = name;
        price = itemPrice;
    }
    public void displayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }
    public double calculateTotalCost(int quantity){
        return price * quantity;
    }
    public static void main(String[] args){
        Item item1 = new Item(101, "Laptop", 750.50);
        item1.displayDetails();
        int quantity = 3;
        System.out.println("Total Cost for " + quantity + "units: $" + item1.calculateTotalCost(quantity));
    }
}
