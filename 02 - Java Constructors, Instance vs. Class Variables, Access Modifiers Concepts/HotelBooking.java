class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBooking();
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        booking2.displayBooking();
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nCopied Booking:");
        booking3.displayBooking();
    }
}
