public class Patient {
    static String hospitalName = "OpenAI General Hospital";
    private static int totalPatients = 0;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Patient ID: " + this.patientID);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice Green", 30, "Flu", 1001);
        Patient p2 = new Patient("Bob Stone", 45, "Fracture", 1002);
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();
        Patient.getTotalPatients();
    }
}
