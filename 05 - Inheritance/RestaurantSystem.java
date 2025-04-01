public class RestaurantSystem {
    interface Worker {
        void performDuties();
    }

    static class Person {
        protected String name;
        protected String id;
        public Person(String name, String id) {
            this.name = name;
            this.id = id;
        }
        public void displayInfo() {
            System.out.println("Name: " + name + ", ID: " + id);
        }
    }

    static class Chef extends Person implements Worker {
        public Chef(String name, String id) {
            super(name, id);
        }
        @Override
        public void performDuties() {
            System.out.println(name + " is cooking delicious food.");
        }
    }

    static class Waiter extends Person implements Worker {
        public Waiter(String name, String id) {
            super(name, id);
        }
        @Override
        public void performDuties() {
            System.out.println(name + " is serving food to customers.");
        }
    }

    public static void main(String[] args) {
        Chef c = new Chef("John", "C001");
        Waiter w = new Waiter("Mike", "W001");
        c.displayInfo();
        c.performDuties();
        w.displayInfo();
        w.performDuties();
    }
}
