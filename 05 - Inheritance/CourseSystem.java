public class CourseSystem {
    static class Course {
        protected String courseName;
        protected int duration;
        public Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }
        public void showDetails() {
            System.out.println("Course: " + courseName + ", Duration: " + duration + " hrs");
        }
    }

    static class OnlineCourse extends Course {
        protected String platform;
        protected boolean isRecorded;
        public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
            super(courseName, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }
        @Override
        public void showDetails() {
            System.out.println("Online Course: " + courseName + ", Duration: " + duration + " hrs, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
        }
    }

    static class PaidOnlineCourse extends OnlineCourse {
        private double fee;
        private double discount;
        public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
            super(courseName, duration, platform, isRecorded);
            this.fee = fee;
            this.discount = discount;
        }
        @Override
        public void showDetails() {
            System.out.println("Paid Course: " + courseName + ", Duration: " + duration + " hrs, Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No") + ", Fee: $" + fee + ", Discount: $" + discount);
        }
    }

    public static void main(String[] args) {
        Course c = new Course("History Basics", 20);
        OnlineCourse o = new OnlineCourse("Intro to Java", 30, "Coursera", true);
        PaidOnlineCourse p = new PaidOnlineCourse("Advanced Java", 40, "Udemy", true, 100.0, 20.0);
        c.showDetails();
        o.showDetails();
        p.showDetails();
    }
}
