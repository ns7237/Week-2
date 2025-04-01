public class VehicleSystem1 {
    interface Refuelable {
        void refuel();
    }

    static class Vehicle {
        protected int maxSpeed;
        protected String model;
        public Vehicle(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }
        public void displayDetails() {
            System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
        }
    }

    static class ElectricVehicle extends Vehicle {
        public ElectricVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }
        public void charge() {
            System.out.println(model + " is charging.");
        }
    }

    static class PetrolVehicle extends Vehicle implements Refuelable {
        public PetrolVehicle(int maxSpeed, String model) {
            super(maxSpeed, model);
        }
        @Override
        public void refuel() {
            System.out.println(model + " is refueling with petrol.");
        }
    }

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang");

        ev.displayDetails();
        ev.charge();

        pv.displayDetails();
        pv.refuel();
    }
}
