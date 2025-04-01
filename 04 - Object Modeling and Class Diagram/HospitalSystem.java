import java.util.ArrayList;
import java.util.List;
public class HospitalSystem {
    static class Doctor {
        private String name;
        private List<Patient> patients;
        public Doctor(String name) {
            this.name = name;
            this.patients = new ArrayList<>();
        }
        public void consult(Patient patient) {
            if (!patients.contains(patient)) {
                patients.add(patient);
            }
            System.out.println(name + " is consulting with " + patient.getName());
        }
        public String getName() {
            return name;
        }
        public List<Patient> getPatients() {
            return patients;
        }
    }
    static class Patient {
        private String name;
        private List<Doctor> doctors;
        public Patient(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
        }
        public void consult(Doctor doctor) {
            if (!doctors.contains(doctor)) {
                doctors.add(doctor);
            }
            System.out.println(name + " is being consulted by " + doctor.getName());
        }
        public String getName() {
            return name;
        }
        public List<Doctor> getDoctors() {
            return doctors;
        }
    }
    static class Hospital {
        private String name;
        private List<Doctor> doctors;
        private List<Patient> patients;
        public Hospital(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
            this.patients = new ArrayList<>();
        }
        public void addDoctor(Doctor doctor) {
            if (!doctors.contains(doctor)) {
                doctors.add(doctor);
            }
        }
        public void addPatient(Patient patient) {
            if (!patients.contains(patient)) {
                patients.add(patient);
            }
        }
        public void showHospitalStatus() {
            System.out.println("Hospital: " + name);
            System.out.println("Doctors in the hospital:");
            for (Doctor doctor : doctors) {
                System.out.println("- " + doctor.getName());
                System.out.println("  Patients:");
                for (Patient patient : doctor.getPatients()) {
                    System.out.println("   - " + patient.getName());
                }
            }
            System.out.println("Patients in the hospital:");
            for (Patient patient : patients) {
                System.out.println("- " + patient.getName());
                System.out.println("  Doctors:");
                for (Doctor doctor : patient.getDoctors()) {
                    System.out.println("   - " + doctor.getName());
                }
            }
        }
    }
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Healthcare Hospital");
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");
        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Doe");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        System.out.println("\n=== Hospital Status ===");
        hospital.showHospitalStatus();
    }
}
