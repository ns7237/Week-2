import java.util.ArrayList;
import java.util.List;
public class CompanyStructure {
    static class Employee {
        private String name;
        public Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    static class Department {
        private String deptName;
        private List<Employee> employees;
        public Department(String deptName) {
            this.deptName = deptName;
            this.employees = new ArrayList<>();
        }
        public void addEmployee(String employeeName) {
            employees.add(new Employee(employeeName));
        }
        public void listEmployees() {
            System.out.println("  Employees in " + deptName + ":");
            for (Employee e : employees) {
                System.out.println("   - " + e.getName());
            }
        }
        public void clearEmployees() {
            employees.clear();
        }
        public String getDeptName() {
            return deptName;
        }
    }
    static class Company {
        private String companyName;
        private List<Department> departments;
        public Company(String companyName) {
            this.companyName = companyName;
            this.departments = new ArrayList<>();
        }
        public void addDepartment(String deptName) {
            departments.add(new Department(deptName));
        }
        public Department getDepartment(String deptName) {
            for (Department d : departments) {
                if (d.getDeptName().equals(deptName)) {
                    return d;
                }
            }
            return null;
        }
        public void listCompanyStructure() {
            System.out.println("Company: " + companyName);
            for (Department dept : departments) {
                dept.listEmployees();
            }
        }
        public void deleteCompany() {
            for (Department d : departments) {
                d.clearEmployees();
            }
            departments.clear();
            System.out.println("Company '" + companyName + "' and all its departments and employees have been deleted.");
        }
    }
    public static void main(String[] args) {
        Company company = new Company("Tech Innovators Inc.");
        company.addDepartment("Engineering");
        company.addDepartment("HR");
        Department engineering = company.getDepartment("Engineering");
        Department hr = company.getDepartment("HR");

        if (engineering != null) {
            engineering.addEmployee("Alice");
            engineering.addEmployee("Bob");
        }
        if (hr != null) {
            hr.addEmployee("Charlie");
        }
        System.out.println("== Company Structure Before Deletion ==");
        company.listCompanyStructure();
        System.out.println("\n== Deleting Company ==");
        company.deleteCompany();
        System.out.println("\n== Trying to Show Structure After Deletion ==");
        company.listCompanyStructure(); // should show nothing
    }
}
