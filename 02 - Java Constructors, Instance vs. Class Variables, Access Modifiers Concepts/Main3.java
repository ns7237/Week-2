public class Main3 {
    public static void main(String[] args){
        Manager mgr = new Manager(101, "HR", 75000.0);
        mgr.showDetails();
        mgr.showSalary();
        mgr.setSalary(80000.0);
        mgr.showSalary();
    }
}
