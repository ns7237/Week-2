import java.util.ArrayList;
import java.util.List;
public class UniversitySystem {
    static class Faculty {
        private String name;
        public Faculty(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    static class Department {
        private String name;
        private List<Faculty> facultyMembers;
        public Department(String name) {
            this.name = name;
            this.facultyMembers = new ArrayList<>();
        }
        public void addFaculty(Faculty faculty) {
            if (!facultyMembers.contains(faculty)) {
                facultyMembers.add(faculty);
            }
        }
        public void listFaculty() {
            System.out.println("Faculty in Department of " + name + ":");
            for (Faculty f : facultyMembers) {
                System.out.println("- " + f.getName());
            }
        }
        public void clearFaculty() {
            facultyMembers.clear();
        }
        public String getName() {
            return name;
        }
    }
    static class University {
        private String name;
        private List<Department> departments;

        public University(String name) {
            this.name = name;
            this.departments = new ArrayList<>();
        }
        public void addDepartment(String deptName) {
            departments.add(new Department(deptName));
        }
        public Department getDepartment(String deptName) {
            for (Department d : departments) {
                if (d.getName().equalsIgnoreCase(deptName)) {
                    return d;
                }
            }
            return null;
        }
        public void listUniversityStructure() {
            System.out.println("University: " + name);
            for (Department d : departments) {
                d.listFaculty();
            }
        }
        public void deleteUniversity() {
            for (Department d : departments) {
                d.clearFaculty();
            }
            departments.clear();
            System.out.println("University '" + name + "' and all its departments have been deleted.");
        }
    }
    public static void main(String[] args) {
        University uni = new University("Global Knowledge University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");
        Faculty alice = new Faculty("Dr. Alice");
        Faculty bob = new Faculty("Dr. Bob");
        Faculty charlie = new Faculty("Dr. Charlie");
        Department cs = uni.getDepartment("Computer Science");
        Department physics = uni.getDepartment("Physics");
        if (cs != null) {
            cs.addFaculty(alice);
            cs.addFaculty(bob);
        }
        if (physics != null) {
            physics.addFaculty(bob);
            physics.addFaculty(charlie);
        }
        System.out.println("== University Structure ==");
        uni.listUniversityStructure();
        System.out.println("\n== Independent Faculty Listing ==");
        System.out.println("Faculty: " + alice.getName());
        System.out.println("Faculty: " + bob.getName());
        System.out.println("Faculty: " + charlie.getName());
        System.out.println("\n== Deleting University ==");
        uni.deleteUniversity();
        System.out.println("\n== Faculty After University Deletion ==");
        System.out.println("Faculty: " + alice.getName());
        System.out.println("Faculty: " + bob.getName());
        System.out.println("Faculty: " + charlie.getName());
    }
}
