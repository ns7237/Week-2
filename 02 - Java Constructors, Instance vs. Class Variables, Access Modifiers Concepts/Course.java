class Course {
String courseName;
int duration;
double fee;
static String instituteName = "ABC Institute";
public Course(String courseName, int duration, double fee) {
    this.courseName = courseName;
    this.duration = duration;
    this.fee = fee;
}
public void displayCourseDetails() {
    System.out.println("Institute: " + instituteName);
    System.out.println("Course Name: " + courseName);
    System.out.println("Duration: " + duration + " weeks");
    System.out.println("Fee: $" + fee);
}
public static void updateInstituteName(String newName) {
    instituteName = newName;
}
public static void main(String[] args) {
    Course course1 = new Course("Java Programming", 6, 300.50);
    Course course2 = new Course("Data Science", 10, 500.75);
    System.out.println("Course 1 Details:");
    course1.displayCourseDetails();
    System.out.println("\nCourse 2 Details:");
    course2.displayCourseDetails();
    Course.updateInstituteName("XYZ Learning Center");
    System.out.println("\nAfter Updating Institute Name:\n");
    System.out.println("Course 1 Details:");
    course1.displayCourseDetails();
    System.out.println("\nCourse 2 Details:");
    course2.displayCourseDetails();
}
}

