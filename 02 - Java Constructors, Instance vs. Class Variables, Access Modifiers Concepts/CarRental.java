class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Assigned";
        this.rentalDays = 0;
        this.dailyRate = 50.0;
    }
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 40.0);
        System.out.println("Rental 1 Details:");
        rental1.displayRentalDetails();
        CarRental rental2 = new CarRental(rental1);
        System.out.println("\nRental 2 (Copied) Details:");
        rental2.displayRentalDetails();
    }
}
