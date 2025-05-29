

 1. Interface with one method
interface OneMethod {
    void display();
}

class OneMethodImpl implements OneMethod {
    public void display() {
        System.out.println("OneMethod Interface Implemented");
    }
}

 2. Interface with two methods, only one implemented
interface TwoMethods {
    void method1();
    void method2();
}

abstract class OneMethodOnlyImpl implements TwoMethods {
    public void method1() {
        System.out.println("Only method1 implemented");
    }
}

 3. Interface instance calling method
class InterfaceInstance {
    public static void main(String[] args) {
        OneMethod obj = new OneMethodImpl();
        obj.display();
    }
}

 4. Two interfaces, one method each
interface A {
    void showA();
}

interface B {
    void showB();
}

class ABImpl implements A, B {
    public void showA() {
        System.out.println("Interface A method");
    }

    public void showB() {
        System.out.println("Interface B method");
    }
}

 5. Two interfaces with same method signature
interface X {
    void sameMethod();
}

interface Y {
    void sameMethod();
}

class XYImpl implements X, Y {
    public void sameMethod() {
        System.out.println("Same method from both interfaces implemented");
    }
}

 6. Interface with default method
interface DefaultInterface {
    default void greet() {
        System.out.println("Default Greeting from Interface");
    }
}

class DefaultImpl implements DefaultInterface { }

 7. Inheriting one interface from another
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InheritedInterfaceImpl implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method");
    }

    public void childMethod() {
        System.out.println("Child method");
    }
}

 8. Public interface with fields
public interface PublicInterface {
    int VALUE = 10;
    void printValue();
}

class PublicInterfaceImpl implements PublicInterface {
    public void printValue() {
        System.out.println("Interface value: " + VALUE);
    }
}

 9. Private or Protected Interface (not allowed in top level)
class InterfaceScope {
    private interface PrivateInterface {
        int PRIVATE_VALUE = 20;
        void privateMethod();
    }

    protected interface ProtectedInterface {
        int PROTECTED_VALUE = 30;
        void protectedMethod();
    }

    static class InnerImpl implements PrivateInterface, ProtectedInterface {
        public void privateMethod() {
            System.out.println("Private Interface Value: " + PRIVATE_VALUE);
        }

        public void protectedMethod() {
            System.out.println("Protected Interface Value: " + PROTECTED_VALUE);
        }
    }
}

 10. Interface with private, public, protected fields (Not valid, only public static final allowed)
interface InvalidInterface {
   
    public int c = 3; // Valid (implicitly public static final)
}

 11. Interface with static final variable
interface StaticFinalVar {
    static final String MESSAGE = "Static Final in Interface";
}

class StaticFinalImpl implements StaticFinalVar {
    public void showMessage() {
        System.out.println(MESSAGE);
    }
}

