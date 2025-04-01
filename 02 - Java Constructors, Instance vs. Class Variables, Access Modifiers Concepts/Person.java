public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person (Person other){
        this.name = other.name;
        this.age = other.age;
    }
    public void displayPerson(){
        System.out.println("Name : " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args){
        Person person1 = new Person("Alice", 25);
        System.out.println("Original Person: ");
        person1.displayPerson();
        Person person2 = new Person(person1);
        System.out.println("\nCloned Person: ");
        person2.displayPerson();

    }
}
