 1. How to create a class, object, method and its signature
class DemoClass {

    public void sayHello() {
        System.out.println("Hello from the method!");
    }

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.sayHello();
    }
}

 2. Write a program to print your name
class PrintName {
    public static void main(String[] args) {
        System.out.println("Tharun Thanugula");
    }
}

3. Write a program for Single line, Multi-line and Documentation comments

 * This is a documentation comment for the class CommentDemo.

class CommentDemo {
    public static void main(String[] args) {
        // This is a single-line comment

        /*
         * This is a multi-line comment.
         * It can span multiple lines.
         */

        System.out.println("Comments are used for explanations!");
    }
}

 4. Define variables for different Data Types and print on Console
class DataTypesDemo {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = true;
        char grade = 'A';
        float height = 5.9f;
        double salary = 65000.50;

        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
    }
}

 5. Local and Global variables with same name and print both to understand scope
class VariableScopeDemo {

    String message = "Global Message";

    public void printMessages() {
        String message = "Local Message";

        System.out.println("Local variable: " + message);
        System.out.println("Global variable: " + this.message);
    }

    public static void main(String[] args) {
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.printMessages();
    }
}

6. Function to print your name and call from main
class FunctionDemo {

    public void printName() {
        System.out.println("Tharun Thanugula");
    }

    public static void main(String[] args) {
        FunctionDemo obj = new FunctionDemo();
        obj.printName();
    }
}
