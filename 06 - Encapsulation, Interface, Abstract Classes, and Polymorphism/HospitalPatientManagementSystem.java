interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    private static final double DAILY_ROOM_CHARGE = 100.0;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return DAILY_ROOM_CHARGE * daysAdmitted;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }
}

class OutPatient extends Patient {
    private static final double CONSULTATION_FEE = 50.0;

    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
    }
}

class PatientRecord implements MedicalRecord {
    private StringBuilder records = new StringBuilder();

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("P001", "John Doe", 30, 5);
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 25);

        PatientRecord patientRecord = new PatientRecord();
        patientRecord.addRecord("Patient admitted for surgery.");
        patientRecord.addRecord("Patient discharged after 5 days of stay.");

        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("Medical Records:\n" + patientRecord.viewRecords());

        System.out.println();

        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill());

        Patient[] patients = {inPatient, outPatient};
        double totalBill = 0;

        for (Patient patient : patients) {
            totalBill += patient.calculateBill();
        }

        System.out.println("\nTotal Bill for All Patients: " + totalBill);
    }
}
