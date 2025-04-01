public class MobilePhone {
    String brand;
    String model;
    double price;
    public MobilePhone(String phoneBrand, String phoneModel, double phonePrice){
        brand = phoneBrand;
        model = phoneModel;
        price = phonePrice;
    }
    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price:  $" + price);
    }
    public static void main(String[] args){
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        phone1.displayDetails();
    }
}
