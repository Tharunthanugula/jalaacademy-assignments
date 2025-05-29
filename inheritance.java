
// Superclass A
class A {
    int value = 10;

    public void methodA1() {
        System.out.println("Method A1 from class A");
    }

    public void methodA2() {
        System.out.println("Method A2 from class A");
    }

    public void display() {
        System.out.println("Display method from class A");
    }
}

// Subclass B extends A
class B extends A {
    int value = 20;

    public void methodB1() {
        System.out.println("Method B1 from class B");
    }

    public void methodB2() {
        System.out.println("Method B2 from class B");
    }

    @Override
    public void display() {
        System.out.println("Display method from class B");
    }
}

// Subclass C extends B
class C extends B {
    int value = 30;

    public void methodC1() {
        System.out.println("Method C1 from class C");
    }

    public void methodC2() {
        System.out.println("Method C2 from class C");
    }

    @Override
    public void display() {
        System.out.println("Display method from class C");
    }
}

// Main class to test
public class InheritanceTest {
    public static void main(String[] args) {
        // Objects of each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling all methods using their own objects
        System.out.println("== Methods from class A ==");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        System.out.println("\n== Methods from class B ==");
        objB.methodA1(); // inherited from A
        objB.methodA2(); // inherited from A
        objB.methodB1();
        objB.methodB2();
        objB.display();

        System.out.println("\n== Methods from class C ==");
        objC.methodA1(); // inherited from A
        objC.methodA2(); // inherited from A
        objC.methodB1(); // inherited from B
        objC.methodB2(); // inherited from B
        objC.methodC1();
        objC.methodC2();
        objC.display();

        // Runtime Polymorphism using super class reference
        System.out.println("\n== Overridden method with superclass reference ==");
        A ref; // Superclass reference

        ref = objB;
        ref.display(); // Calls B's display

        ref = objC;
        ref.display(); // Calls C's display

        // Instance variables polymorphism demo
        System.out.println("\n== Instance variable access via superclass reference ==");
        ref = objB;
        System.out.println("ref.value (A reference to B): " + ref.value); // prints 10

        ref = objC;
        System.out.println("ref.value (A reference to C): " + ref.value); // prints 10

        // Accessing actual instance variables directly
        System.out.println("\n== Instance variables from their own objects ==");
        System.out.println("objA.value: " + objA.value); // 10
        System.out.println("objB.value: " + objB.value); // 20
        System.out.println("objC.value: " + objC.value); // 30
    }
}
