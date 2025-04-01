class Manager extends Employee {
    Manager(int id, String dept, double sal){
        super(id, dept,sal);
    }
    public void showDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}
