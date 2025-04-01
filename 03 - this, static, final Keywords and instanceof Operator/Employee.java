public class Employee {
    static String companyName = "OpenAI Innovations";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + this.name);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "Software Engineer");
        Employee emp2 = new Employee("Jane Smith", 102, "Data Scientist");
        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();
        Employee.displayTotalEmployees();
    }
}
