class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void barks () {
        System.out.println("Dog barks");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();             // Only Animal class method accessible
        // a.bark();           // Error: bark() is not in Animal class
    }
}
