class MethodOverloadingDemo {

     1. Two methods with same name, different number of parameters (same type)
    void display(int a) {
        System.out.println("Display with one int: " + a);
    }

    void display(int a, int b) {
        System.out.println("Display with two ints: " + a + ", " + b);
    }

     2. Two methods with same name, different number of parameters (different data types)
    void show(int a) {
        System.out.println("Show with one int: " + a);
    }

    void show(int a, String s) {
        System.out.println("Show with int and String: " + a + ", " + s);
    }

     3. Two methods with same name, same number of parameters, same type (Not allowed in Java)
     This will cause compile time error if both methods exist.
     void print(int a) { System.out.println("Print int: " + a); }
     void print(int b) { System.out.println("Print int again: " + b); }

     4. Two methods with same name, same number of parameters but different types
    void print(int a) {
        System.out.println("Print int: " + a);
    }

    void print(String s) {
        System.out.println("Print String: " + s);
    }

     5. Two methods with same name, number and type of parameters but different return types (Not allowed in Java)
     int add(int a, int b) { return a + b; }
     String add(int a, int b) { return "" + (a + b); }

     To demonstrate 5 (not valid), we use different method names instead.

    int addInt(int a, int b) {
        return a + b;
    }

    String addString(int a, int b) {
        return String.valueOf(a + b);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        System.out.println("---- 1. Different number of params (same type) ----");
        obj.display(5);
        obj.display(5, 10);

        System.out.println("\n---- 2. Different number of params (different types) ----");
        obj.show(20);
        obj.show(20, "Hello");

        System.out.println("\n---- 4. Same number of params but different types ----");
        obj.print(100);
        obj.print("Test");

        System.out.println("\n---- 5. Same signature but different return types (Not allowed in Java) ----");
        System.out.println("addInt: " + obj.addInt(3, 4));
        System.out.println("addString: " + obj.addString(3, 4));
    }
}
