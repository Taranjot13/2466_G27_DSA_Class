//abstract
abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void sound();
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.sound();  
        dog.sleep();  
    }
}



//interface
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }
}
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();   
        bird.swim();  
    }
}
