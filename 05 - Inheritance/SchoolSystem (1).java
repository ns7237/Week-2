public class SchoolSystem {
    static class Person {
        protected String name;
        protected int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    static class Teacher extends Person {
        private String subject;
        public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
        }
        public void displayRole() {
            System.out.println("Role: Teacher, Subject: " + subject);
        }
    }

    static class Student extends Person {
        private String grade;
        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }
        public void displayRole() {
            System.out.println("Role: Student, Grade: " + grade);
        }
    }

    static class Staff extends Person {
        private String department;
        public Staff(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }
        public void displayRole() {
            System.out.println("Role: Staff, Department: " + department);
        }
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Mathematics");
        Student s = new Student("Bob", 16, "10th Grade");
        Staff st = new Staff("Charlie", 40, "Administration");
        t.displayInfo();
        t.displayRole();
        s.displayInfo();
        s.displayRole();
        st.displayInfo();
        st.displayRole();
    }
}
