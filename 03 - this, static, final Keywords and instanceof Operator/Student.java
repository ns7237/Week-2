public class Student {
    static String universityName = "OpenAI University";
    private static int totalStudents = 0;
    private String name;
    private final int rollNumber;
    private char grade;
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number: " + this.rollNumber);
        } else {
            System.out.println("Operation failed. Object is not a Student.");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", 101, 'A');
        Student student2 = new Student("Bob Martin", 102, 'B');
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        Student.displayTotalStudents();
        System.out.println();
        student2.updateGrade('A');
        System.out.println();
        student2.displayStudentDetails();
    }
}
