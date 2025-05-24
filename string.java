public class JalaStringsDemo {

    public static void main(String[] args) {
         1. Different ways creating a string
        String s1 = "Hello";                   // String literal
        String s2 = new String("World");       // Using new keyword
        char[] chars = {'J', 'A', 'L', 'A'};
        String s3 = new String(chars);         // From char array

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

         2. Concatenating two strings using + operator
        String s4 = s1 + " " + s2;
        System.out.println("Concatenated String: " + s4);

         3. Finding the length of the string
        System.out.println("Length of s4: " + s4.length());

         4. Extract a string using Substring
        System.out.println("Substring (0 to 5) of s4: " + s4.substring(0, 5));

        5. Searching in strings using indexOf()
        System.out.println("Index of 'World' in s4: " + s4.indexOf("World"));

         6. Matching a String Against a Regular Expression With matches()
        String regex = "[A-Za-z ]+";  // Only letters and space
        System.out.println("Does s4 match regex? " + s4.matches(regex));

         7. Comparing strings using the methods equals(), equalsIgnoreCase(), startsWith(), endsWith(), compareTo()
        String s5 = "hello";
        System.out.println("s1 equals s5? " + s1.equals(s5));
        System.out.println("s1 equalsIgnoreCase s5? " + s1.equalsIgnoreCase(s5));
        System.out.println("s4 starts with 'Hello'? " + s4.startsWith("Hello"));
        System.out.println("s4 ends with 'World'? " + s4.endsWith("World"));
        System.out.println("s1 compareTo s5: " + s1.compareTo(s5));

        9. Trimming strings with trim()
        String s6 = "   JALA Academy   ";
        System.out.println("Before trim: '" + s6 + "'");
        System.out.println("After trim: '" + s6.trim() + "'");

         10. Replacing characters in strings with replace()
        String s7 = s4.replace('l', 'x');
        System.out.println("Replace 'l' with 'x' in s4: " + s7);

         11. Splitting strings with split()
        String[] parts = s4.split(" ");
        System.out.println("Splitting s4 by space:");
        for (String part : parts) {
            System.out.println(part);
        }

         12. Converting Numbers to Strings with valueOf()
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("Number to String: " + numStr);

         13. Converting integer objects to Strings
        Integer numObj = 456;
        String numObjStr = numObj.toString();
        System.out.println("Integer object to String: " + numObjStr);

         14. Converting to uppercase and lowercase
        System.out.println("Uppercase s4: " + s4.toUpperCase());
        System.out.println("Lowercase s4: " + s4.toLowerCase());
    }
}
