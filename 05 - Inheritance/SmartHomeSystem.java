public class SmartHomeSystem {
    static class Device {
        protected String deviceId;
        protected String status;
        public Device(String deviceId, String status) {
            this.deviceId = deviceId;
            this.status = status;
        }
        public void displayStatus() {
            System.out.println("Device ID: " + deviceId + ", Status: " + status);
        }
    }

    static class Thermostat extends Device {
        private int temperatureSetting;
        public Thermostat(String deviceId, String status, int temperatureSetting) {
            super(deviceId, status);
            this.temperatureSetting = temperatureSetting;
        }
        @Override
        public void displayStatus() {
            System.out.println("Thermostat ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
        }
    }

    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", "Online", 22);
        Thermostat t2 = new Thermostat("T1002", "Offline", 18);
        t1.displayStatus();
        t2.displayStatus();
    }
}
