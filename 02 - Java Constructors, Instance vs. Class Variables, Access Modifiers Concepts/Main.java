public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayInfo();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 8.7, "Computer Science");
        pg.displayInfo();
        pg.displayPostgradInfo();
    }
}
