public class AnimalHierarchy {
    static class Animal {
        protected String name;
        protected int age;
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void makeSound() {
            System.out.println(name + " makes a generic animal sound.");
        }
    }

    static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }
        @Override
        public void makeSound() {
            System.out.println(name + " barks: Woof Woof!");
        }
    }

    static class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }
        @Override
        public void makeSound() {
            System.out.println(name + " meows: Meow Meow!");
        }
    }

    static class Bird extends Animal {
        public Bird(String name, int age) {
            super(name, age);
        }
        @Override
        public void makeSound() {
            System.out.println(name + " chirps: Tweet Tweet!");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Rex", 4);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
