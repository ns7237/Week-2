import java.util.ArrayList;
import java.util.Scanner;
class CartItem{
    private String itemName;
    private double price;
    private int quantity;
    public CartItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName(){
        return itemName;
    }
    public double getTotalPrice(){
        return price * quantity;
    }
    public int getQuantity(){
        return quantity;

    }
}
class ShoppingCart{
    private ArrayList<CartItem> cartItems;
    public ShoppingCart(){
        cartItems = new ArrayList<>();
    }
    public void addItem(String itemName, double price, int quantity){
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " x " + itemName + " added to the cart.");
    }
    public void removeItem(String itemName){
        boolean found = false;
        for (int i = 0; i < cartItems.size(); i++){
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)){
                cartItems.remove(i);
                found = true;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if(!found){
            System.out.println("Item not found in the cart.");
        }
    }
    public void displayTotalCost(){
        double total = 0;
        for (CartItem item : cartItems){
            total += item.getTotalPrice();
        }
        System.out.println("Total cost: " + total);
    }
}
public class ShoppingCartApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while(true){
            System.out.println("\nShopping Cart Menu: ");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3.Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2:
                    System.out.println("Enter item name to remove: ");
                    String removeItemName = scanner.nextLine();
                    cart.removeItem(removeItemName);
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.print("Exiting... Thank you for Shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try agian");
            }
        }
    }
}
