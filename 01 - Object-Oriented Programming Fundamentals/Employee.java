public class Employee  {
    String name;
    int id;
    double salary;
    public Employee(String empName, int empId, double empSalary){
        name = empName;
        id = empId;
        salary = empSalary;
    }
    public void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] ags){
        Employee emp1 = new Employee("John Doe", 101, 50000);
        emp1.displayDetails();
    }
}
