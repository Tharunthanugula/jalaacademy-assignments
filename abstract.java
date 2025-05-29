abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();      
        animal.makeSound();   

        Dog dog = new Dog();
        dog.makeSound();      
        dog.eat();            
    }
}
