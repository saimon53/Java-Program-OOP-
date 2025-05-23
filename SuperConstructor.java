class Animal {
    Animal(String name) {
        System.out.println("Animal constructor called. Name: " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
        System.out.println("Dog constructor called.");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
