interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class VehicleGPS implements GPS {
    private String currentLocation;

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("V001", "John", 10.0);
        Vehicle bike = new Bike("V002", "Alice", 5.0);
        Vehicle auto = new Auto("V003", "Bob", 8.0);

        car.getVehicleDetails();
        System.out.println("Fare for 15 km: " + car.calculateFare(15));
        System.out.println();

        bike.getVehicleDetails();
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));
        System.out.println();

        auto.getVehicleDetails();
        System.out.println("Fare for 20 km: " + auto.calculateFare(20));
        System.out.println();

        Vehicle[] vehicles = {car, bike, auto};
        double totalFare = 0;

        for (Vehicle vehicle : vehicles) {
            totalFare += vehicle.calculateFare(10); // Assuming 10 km for all
        }

        System.out.println("Total fare for 10 km for all vehicles: " + totalFare);
    }
}
