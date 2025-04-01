class Circle {
    double radius;
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public void displayCircleInfo(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println("Circle 1 Details: ");
        circle1.displayCircleInfo();
        Circle circle2 = new Circle(5.5);
        System.out.println("\nCircle 2 Details: ");
        circle2.displayCircleInfo();
    }
}
