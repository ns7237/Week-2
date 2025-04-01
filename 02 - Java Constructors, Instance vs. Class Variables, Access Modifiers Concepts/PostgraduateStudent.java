class PostgraduateStudent extends Student {
    private String specialization;
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }
    public void displayPostgradInfo() {
        System.out.println("Postgraduate Student Info:");
        System.out.println("Name (accessed via protected): " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
}
