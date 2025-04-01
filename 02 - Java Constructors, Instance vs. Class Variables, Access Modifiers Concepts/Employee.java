class Employee{
    public int employeeID;
    protected String department;
    private double salary;
    Employee(int id, String dept, double sal){
        employeeID = id;
        department = dept;
        salary = sal;
    }
    public void setSalary(double newSalary){
        if (newSalary > 0){
            salary = newSalary;
        } else{
            System.out.println("Inavalid salary amount.");
        }
    }
    public void showSalary(){
        System.out.println("Salary: " + salary);
    }
}