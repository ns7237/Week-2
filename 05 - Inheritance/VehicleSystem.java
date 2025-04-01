public class VehicleSystem {
    static class Vehicle {
        protected String fuelType;
        protected int maxSpeed;
        public Vehicle(String fuelType, int maxSpeed) {
            this.fuelType = fuelType;
            this.maxSpeed = maxSpeed;
        }
        public void displayInfo() {
            System.out.println("Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h");
        }
    }

    static class Car extends Vehicle {
        private int seatCapacity;
        public Car(String fuelType, int maxSpeed, int seatCapacity) {
            super(fuelType, maxSpeed);
            this.seatCapacity = seatCapacity;
        }
        @Override
        public void displayInfo() {
            System.out.println("Car - Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h, Seats: " + seatCapacity);
        }
    }

    static class Truck extends Vehicle {
        private int loadCapacity;
        public Truck(String fuelType, int maxSpeed, int loadCapacity) {
            super(fuelType, maxSpeed);
            this.loadCapacity = loadCapacity;
        }
        @Override
        public void displayInfo() {
            System.out.println("Truck - Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h, Load: " + loadCapacity + " kg");
        }
    }

    static class Motorcycle extends Vehicle {
        private boolean hasStorage;
        public Motorcycle(String fuelType, int maxSpeed, boolean hasStorage) {
            super(fuelType, maxSpeed);
            this.hasStorage = hasStorage;
        }
        @Override
        public void displayInfo() {
            System.out.println("Motorcycle - Fuel Type: " + fuelType + ", Max Speed: " + maxSpeed + " km/h, Storage: " + (hasStorage ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Petrol", 180, 5);
        vehicles[1] = new Truck("Diesel", 120, 5000);
        vehicles[2] = new Motorcycle("Petrol", 150, true);
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
