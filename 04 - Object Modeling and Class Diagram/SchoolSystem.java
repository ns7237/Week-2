import java.util.ArrayList;
import java.util.List;
public class SchoolSystem {
    static class Course {
        private String courseName;
        private List<Student> enrolledStudents;
        public Course(String courseName) {
            this.courseName = courseName;
            this.enrolledStudents = new ArrayList<>();
        }
        public void enrollStudent(Student student) {
            if (!enrolledStudents.contains(student)) {
                enrolledStudents.add(student);
                student.enrollInCourse(this);
            }
        }
        public void listEnrolledStudents() {
            System.out.println("Students enrolled in " + courseName + ":");
            for (Student student : enrolledStudents) {
                System.out.println("- " + student.getName());
            }
        }
        public String getCourseName() {
            return courseName;
        }
    }
    static class Student {
        private String name;
        private List<Course> enrolledCourses;
        public Student(String name) {
            this.name = name;
            this.enrolledCourses = new ArrayList<>();
        }
        public void enrollInCourse(Course course) {
            if (!enrolledCourses.contains(course)) {
                enrolledCourses.add(course);
                course.enrollStudent(this);
            }
        }
        public void viewCourses() {
            System.out.println(name + " is enrolled in:");
            for (Course course : enrolledCourses) {
                System.out.println("- " + course.getCourseName());
            }
        }
        public String getName() {
            return name;
        }
    }
    static class School {
        private String name;
        private List<Student> students;
        public School(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }
        public void addStudent(Student student) {
            if (!students.contains(student)) {
                students.add(student);
            }
        }
        public void listStudents() {
            System.out.println("Students in " + name + ":");
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        School school = new School("Greenfield High School");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        school.addStudent(alice);
        school.addStudent(bob);
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(math);
        System.out.println("=== School Info ===");
        school.listStudents();
        System.out.println("\n=== Student Course Enrollments ===");
        alice.viewCourses();
        bob.viewCourses();
        System.out.println("\n=== Course Enrollments ===");
        math.listEnrolledStudents();
        science.listEnrolledStudents();
    }
}
