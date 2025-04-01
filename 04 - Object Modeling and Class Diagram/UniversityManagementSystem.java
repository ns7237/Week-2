import java.util.ArrayList;
import java.util.List;
public class UniversityManagementSystem {
    static class Student {
        private String name;
        private List<Course> enrolledCourses;
        public Student(String name) {
            this.name = name;
            this.enrolledCourses = new ArrayList<>();
        }
        public void enrollCourse(Course course) {
            if (!enrolledCourses.contains(course)) {
                enrolledCourses.add(course);
                course.addStudent(this);  // Add the student to the course
            }
            System.out.println(name + " enrolled in " + course.getName());
        }
        public String getName() {
            return name;
        }
        public List<Course> getEnrolledCourses() {
            return enrolledCourses;
        }
    }
    static class Professor {
        private String name;
        private List<Course> taughtCourses;
        public Professor(String name) {
            this.name = name;
            this.taughtCourses = new ArrayList<>();
        }
        public void assignProfessor(Course course) {
            if (!taughtCourses.contains(course)) {
                taughtCourses.add(course);
                course.assignProfessor(this);
            }
            System.out.println(name + " is assigned to teach " + course.getName());
        }
        public String getName() {
            return name;
        }
        public List<Course> getTaughtCourses() {
            return taughtCourses;
        }
    }
    static class Course {
        private String name;
        private Professor professor;
        private List<Student> students;
        public Course(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }
        public void addStudent(Student student) {
            if (!students.contains(student)) {
                students.add(student);
            }
        }
        public void assignProfessor(Professor professor) {
            this.professor = professor;
        }
        public String getName() {
            return name;
        }
        public Professor getProfessor() {
            return professor;
        }
        public List<Student> getStudents() {
            return students;
        }
        public void displayCourseDetails() {
            System.out.println("Course: " + name);
            System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned yet"));
            System.out.println("Enrolled Students:");
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Mathematics 101");
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);
        System.out.println("\n=== Course Details ===");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
