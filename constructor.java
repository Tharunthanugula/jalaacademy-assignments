

1. Class with default, one-arg, two-arg constructors
class ConstructorDemo {
    ConstructorDemo() {
        System.out.println("Default constructor called");
    }

    ConstructorDemo(String name) {
        System.out.println("One-arg constructor called: " + name);
    }

    ConstructorDemo(String name, int age) {
        System.out.println("Two-arg constructor called: Name = " + name + ", Age = " + age);
    }
}

 2. Calling superclass constructors from child class
class SuperClass {
    SuperClass() {
        System.out.println("SuperClass default constructor");
    }

    SuperClass(String msg) {
        System.out.println("SuperClass argument constructor: " + msg);
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super(); 
        System.out.println("SubClass default constructor");
    }

    SubClass(String msg) {
        super(msg); 
        System.out.println("SubClass argument constructor: " + msg);
    }
}

 3. Constructor with different access modifiers
class AccessModifierConstructors {
    private AccessModifierConstructors() {
        System.out.println("Private constructor");
    }

    public AccessModifierConstructors(int x) {
        System.out.println("Public constructor: " + x);
    }

    protected AccessModifierConstructors(String s) {
        System.out.println("Protected constructor: " + s);
    }

    AccessModifierConstructors(double d) {
        System.out.println("Default (package-private) constructor: " + d);
    }

    static AccessModifierConstructors createUsingPrivate() {
        return new AccessModifierConstructors();
    }
}

4. Constructor with return type (INVALID - for demonstration only)
class InvalidConstructor {
    int InvalidConstructor() {
        System.out.println("This is a method, not a constructor (int return type)");
        return 0;
    }

    String InvalidConstructor(String s) {
        System.out.println("This is also a method, not a constructor (String return type)");
        return s;
    }

    InvalidConstructor() {
        System.out.println("Valid constructor of InvalidConstructor class");
    }
}

 5. Try calling constructor multiple times with same object (Not Possible)
class ConstructorOnce {
    ConstructorOnce() {
        System.out.println("ConstructorOnce created");
    }

    void repeatInit() {
        System.out.println("You can't call constructor again on same object, only one time during creation.");
    }
}


public class ConstructorsExample {
    public static void main(String[] args) {
        System.out.println("---- 1. Call all constructors of a class ----");
        ConstructorDemo obj1 = new ConstructorDemo();
        ConstructorDemo obj2 = new ConstructorDemo("Tharun");
        ConstructorDemo obj3 = new ConstructorDemo("Tharun", 22);

        System.out.println("\n---- 2. Call superclass constructors from subclass ----");
        SubClass sub1 = new SubClass();
        SubClass sub2 = new SubClass("Hello");

        System.out.println("\n---- 3. Access Modifier Constructors ----");
        AccessModifierConstructors pub = new AccessModifierConstructors(5);
        AccessModifierConstructors prot = new AccessModifierConstructors("Protected");
        AccessModifierConstructors def = new AccessModifierConstructors(3.14);
        AccessModifierConstructors pri = AccessModifierConstructors.createUsingPrivate();

        System.out.println("\n---- 4. Invalid Constructors with Return Types ----");
        InvalidConstructor invalid = new InvalidConstructor();
        invalid.InvalidConstructor(); 
        invalid.InvalidConstructor("Test"); 

        System.out.println("\n---- 5. Try calling constructor multiple times ----");
        ConstructorOnce once = new ConstructorOnce();
        once.repeatInit(); 
    }
}
