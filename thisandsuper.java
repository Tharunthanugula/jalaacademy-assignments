class Parent {
    int x = 100;

    Parent() {
        System.out.println("Parent class constructor called");
    }

    Parent(String msg) {
        System.out.println("Parent class argument constructor: " + msg);
    }

    void parentMethod() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int x = 200;

     1. Print current class instance members using 'this'
    void printCurrentFields() {
        int x = 300; // local variable
        System.out.println("Local x: " + x);
        System.out.println("Child class instance x using this: " + this.x);
    }

     2. Print parent class instance members using 'super'
    void printParentFields() {
        System.out.println("Parent class instance x using super: " + super.x);
    }

     3 & 4. Call current class constructor using this()
    Child() {
        this("Hello");
        System.out.println("Default constructor of Child");
    }

    Child(String msg) {
        super("From Child");
        System.out.println("Child class argument constructor: " + msg);
    }

     6. Use this() and super() in methods (not allowed directly, but we can call methods)
    void methodWithThisAndSuper() {
        this.printCurrentFields();  
        super.parentMethod();       
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.printCurrentFields();     
        c.printParentFields();      
        c.methodWithThisAndSuper(); 
    }
}
