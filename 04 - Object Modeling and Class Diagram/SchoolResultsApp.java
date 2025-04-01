import java.util.ArrayList;
import java.util.List;
public class SchoolResultsApp {
    static class Subject {
        private String name;
        private double score;
        public Subject(String name, double score) {
            this.name = name;
            this.score = score;
        }
        public double getScore() {
            return score;
        }
        public String getName() {
            return name;
        }
    }

    // Student class
    static class Student {
        private String name;
        private String studentId;
        private List<Subject> subjects;

        public Student(String name, String studentId) {
            this.name = name;
            this.studentId = studentId;
            this.subjects = new ArrayList<>();
        }

        public void addSubject(Subject subject) {
            subjects.add(subject);
        }

        public List<Subject> getSubjects() {
            return subjects;
        }
        public String getName() {
            return name;
        }
    }
    static class GradeCalculator {
        public double calculateAverage(Student student) {
            List<Subject> subjects = student.getSubjects();
            if (subjects.isEmpty()) {
                return 0.0;
            }

            double total = 0;
            for (Subject subject : subjects) {
                total += subject.getScore();
            }

            return total / subjects.size();
        }
        public String calculateGrade(Student student) {
            double average = calculateAverage(student);

            if (average >= 90) return "A";
            else if (average >= 80) return "B";
            else if (average >= 70) return "C";
            else if (average >= 60) return "D";
            else return "F";
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Sin", "S101");
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 78));
        student.addSubject(new Subject("English", 92));
        GradeCalculator calculator = new GradeCalculator();
        double average = calculator.calculateAverage(student);
        String grade = calculator.calculateGrade(student);
        System.out.println(student.getName() + "'s Average: " + average);
        System.out.println(student.getName() + "'s Grade: " + grade);
    }
}
