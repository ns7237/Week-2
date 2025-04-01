public class Student {
    String name;
    int rollNumber;
    double marks;
    public Student(String studentName, int studentRoll, double studentMarks){
        name = studentName;
        rollNumber = studentRoll;
        marks = studentMarks;
    }
    public char calculateGrade(){
        if(marks >= 90){
            return 'A';
        } else if (marks >= 80){
            return 'B';
        } else if (marks >= 70){
            return 'C';
        } else if (marks >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
    public void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method inside Student class
    public static void main(String[] args) {
        // Create a Student object with sample values
        Student student1 = new Student("Alice Johnson", 101, 85.5);

        // Display student details and grade
        student1.displayDetails();
    }
}



