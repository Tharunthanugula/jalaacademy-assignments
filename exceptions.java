import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;



class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionsDemo {

     3. Method which throws exception without try block
    static void methodThrowsException() throws ArithmeticException {
        int a = 10 / 0; 
    }

    public static void main(String[] args) {

        System.out.println("---- 1. Arithmetic Exception without handling (commented to avoid crash) ----");
         int a = 10 / 0; 

        System.out.println("\n---- 2. Handle Arithmetic Exception using try-catch ----");
        try {
            int b = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("\n---- 3. Call method which throws exception without try (commented - will crash) ----");

        System.out.println("\n---- 4. Multiple catch blocks ----");
        try {
            int[] arr = new int[3];
            arr[5] = 10;  
            int c = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("\n---- 5. Throw exception with own message ----");
        try {
            throw new ArithmeticException("Custom Arithmetic exception message");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n---- 6. Custom Exception ----");
        try {
            throw new CustomException("This is my custom exception");
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }

        System.out.println("\n---- 7. finally block demonstration ----");
        try {
            System.out.println("Inside try block");
            int d = 10 / 2;
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block - always executes");
        }

        System.out.println("\n---- 8. Generate Arithmetic Exception ----");
        try {
            int e = 5 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 9. Generate ArrayIndexOutOfBoundsException ----");
        try {
            int[] arr = new int[2];
            int val = arr[5];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 10. Generate ClassNotFoundException ----");
        try {
            Class.forName("non.existing.ClassName");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 11. Generate FileNotFoundException ----");
        try {
            FileInputStream fis = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 12. Generate IOException ----");
        try {
            throw new IOException("Simulated IO Exception");
        } catch (IOException ex) {
            System.out.println("IOException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 13. Generate NoSuchFieldException ----");
        try {
            Field f = String.class.getField("nonExistingField");
        } catch (NoSuchFieldException ex) {
            System.out.println("NoSuchFieldException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 14. Generate NoSuchMethodException ----");
        try {
            Method m = String.class.getMethod("nonExistingMethod");
        } catch (NoSuchMethodException ex) {
            System.out.println("NoSuchMethodException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 15. Generate NullPointerException ----");
        try {
            String s = null;
            s.length();
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 16. Generate NumberFormatException ----");
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 17. Generate StringIndexOutOfBoundsException ----");
        try {
            String str = "abc";
            char c = str.charAt(5);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("StringIndexOutOfBoundsException caught: " + ex.getMessage());
        }

        System.out.println("\n---- 18. Generate SQLException ----");
        try {
            throw new SQLException("Simulated SQL Exception");
        } catch (SQLException ex) {
            System.out.println("SQLException caught: " + ex.getMessage());
        }
    }
}
