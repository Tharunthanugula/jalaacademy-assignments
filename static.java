public class JalaStaticExample {

     1. Two static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Static String";

     Two instance variables
    int instanceVar1 = 20;
    String instanceVar2 = "Instance String";

     2. Print instance variables in static methods - Need object to access instance variables
    public static void staticMethod1() {
        System.out.println("Inside staticMethod1:");
         Access static variables directly
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);

        To print instance variables, create an instance
        JalaStaticExample obj = new JalaStaticExample();
        System.out.println("InstanceVar1 (from staticMethod1): " + obj.instanceVar1);
        System.out.println("InstanceVar2 (from staticMethod1): " + obj.instanceVar2);

         4. Call instance method from static method using object
        obj.instanceMethod1();
    }

    public static void staticMethod2() {
        System.out.println("Inside staticMethod2:");
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
    }

     3. Print static variables in instance methods
    public void instanceMethod1() {
        System.out.println("Inside instanceMethod1:");
        System.out.println("StaticVar1 (from instanceMethod1): " + staticVar1);
        System.out.println("StaticVar2 (from instanceMethod1): " + staticVar2);
    }

    public void instanceMethod2() {
        System.out.println("Inside instanceMethod2:");
         3. Printing static vars
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);

         5. Call static methods in instance method
        staticMethod2();
    }

    public static void main(String[] args) {
        System.out.println("=== Inside main method ===");

         6. Print all static and instance variables in main method
        System.out.println("Static Variables:");
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);

        JalaStaticExample obj = new JalaStaticExample();

        System.out.println("Instance Variables:");
        System.out.println("instanceVar1: " + obj.instanceVar1);
        System.out.println("instanceVar2: " + obj.instanceVar2);

         7. Call static methods and instance methods in main method
        System.out.println("\nCalling staticMethod1:");
        staticMethod1();

        System.out.println("\nCalling staticMethod2:");
        staticMethod2();

        System.out.println("\nCalling instanceMethod1:");
        obj.instanceMethod1();

        System.out.println("\nCalling instanceMethod2:");
        obj.instanceMethod2();
    }
}
