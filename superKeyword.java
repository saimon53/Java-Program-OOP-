class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calling parent class constructor
        System.out.println("Dog constructor called");
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
