public class Circle {
    double radius;
    public Circle(double r){
        radius = r;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    public void displayDetails(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main(String[] args){
        Circle myCircle = new Circle(5);
        myCircle.displayDetails();
    }
}
