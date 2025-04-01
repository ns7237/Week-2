public class Vehicle {
    static double registrationFee = 500.00;
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated registration fee: $" + registrationFee);
    }
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Emma Watson", "Car", "REG12345");
        Vehicle vehicle2 = new Vehicle("Liam Brown", "Motorbike", "REG67890");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
        System.out.println();
        Vehicle.updateRegistrationFee(550.00);
        System.out.println();
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}
