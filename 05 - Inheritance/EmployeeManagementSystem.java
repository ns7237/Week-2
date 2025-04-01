public class EmployeeManagementSystem {
    static class Employee {
        protected String name;
        protected int id;
        protected double salary;
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        public void displayDetails() {
            System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
        }
    }

    static class Manager extends Employee {
        private int teamSize;
        public Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }
        @Override
        public void displayDetails() {
            System.out.println("Manager - Name: " + name + ", ID: " + id + ", Salary: $" + salary + ", Team Size: " + teamSize);
        }
    }

    static class Developer extends Employee {
        private String programmingLanguage;
        public Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }
        @Override
        public void displayDetails() {
            System.out.println("Developer - Name: " + name + ", ID: " + id + ", Salary: $" + salary + ", Language: " + programmingLanguage);
        }
    }

    static class Intern extends Employee {
        private String university;
        public Intern(String name, int id, double salary, String university) {
            super(name, id, salary);
            this.university = university;
        }
        @Override
        public void displayDetails() {
            System.out.println("Intern - Name: " + name + ", ID: " + id + ", Salary: $" + salary + ", University: " + university);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 95000, 5);
        Employee e2 = new Developer("Bob", 102, 80000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "MIT");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
