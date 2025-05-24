public class JalaOperators {

     1. Function for arithmetic operators (+, -, *, /)
    public static void arithmeticOperators(int a, int b) {
        System.out.println("Arithmetic Operators with " + a + " and " + b);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division by zero is not allowed");
        }
        System.out.println();
    }

     2. Method for increment and decrement operators
    public static void incrementDecrementOperators(int x) {
        System.out.println("Original x = " + x);
        System.out.println("Post-increment x++ = " + (x++)); // prints original then increments
        System.out.println("After post-increment x = " + x);
        System.out.println("Pre-increment ++x = " + (++x));  // increments then prints
        System.out.println("Post-decrement x-- = " + (x--)); // prints then decrements
        System.out.println("After post-decrement x = " + x);
        System.out.println("Pre-decrement --x = " + (--x));  // decrements then prints
        System.out.println();
    }

     3. Program to demonstrate equal (==) and not equal (!=) operators
    public static void equalityOperators(int a, int b) {
        System.out.println("Comparing " + a + " and " + b);
        System.out.println("Equal (==): " + (a == b));
        System.out.println("Not Equal (!=): " + (a != b));
        System.out.println();
    }

     4. Program to find if two numbers are equal or not (using if-else)
    public static void checkEqual(int a, int b) {
        if (a == b) {
            System.out.println(a + " and " + b + " are equal.");
        } else {
            System.out.println(a + " and " + b + " are not equal.");
        }
        System.out.println();
    }

    5. Programs on Logical AND (&&), OR (||), and NOT (!) operators
    public static void logicalOperators(boolean p, boolean q) {
        System.out.println("Logical operations with p=" + p + " and q=" + q);
        System.out.println("Logical AND (p && q): " + (p && q));
        System.out.println("Logical OR (p || q): " + (p || q));
        System.out.println("Logical NOT (!p): " + (!p));
        System.out.println();
    }

     6. Program for relational operators (<, <=, >, >=)
    public static void relationalOperators(int a, int b) {
        System.out.println("Relational operators between " + a + " and " + b);
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println();
    }

    7. Print the smaller and larger number
    public static void printSmallerLarger(int a, int b) {
        if (a == b) {
            System.out.println("Both numbers are equal: " + a);
        } else {
            int smaller = (a < b) ? a : b;
            int larger = (a > b) ? a : b;
            System.out.println("Smaller number: " + smaller);
            System.out.println("Larger number: " + larger);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test all methods

        arithmeticOperators(20, 5);
        incrementDecrementOperators(10);
        equalityOperators(10, 10);
        equalityOperators(10, 20);
        checkEqual(15, 15);
        checkEqual(15, 30);
        logicalOperators(true, false);
        logicalOperators(false, false);
        relationalOperators(10, 20);
        relationalOperators(30, 15);
        printSmallerLarger(10, 20);
        printSmallerLarger(50, 50);
    }
}
