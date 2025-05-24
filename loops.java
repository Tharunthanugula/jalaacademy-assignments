public class JalaLoops {

     1. Print "Bright IT Career" 10 times using for loop
    public static void printBrightITCareer() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ": Bright IT Career");
        }
        System.out.println();
    }

     2. Print 1 to 20 numbers using while loop
    public static void printOneToTwenty() {
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
    }

     3. Program to equal operator and not equal operator (just prints examples)
    public static void equalAndNotEqualOperators(int a, int b) {
        System.out.println("Equal (==): " + (a == b));
        System.out.println("Not Equal (!=): " + (a != b));
        System.out.println();
    }

     4. Print odd and even numbers from 1 to 20
    public static void printOddEvenNumbers() {
        System.out.print("Even numbers: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println("\n");
    }

     5. Largest number among three numbers
    public static void printLargestNumber(int a, int b, int c) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Largest number among " + a + ", " + b + " and " + c + " is: " + largest);
        System.out.println();
    }

    6. Print even numbers between 10 and 100 using while loop
    public static void printEvenBetween10And100() {
        int num = 10;
        System.out.print("Even numbers between 10 and 100: ");
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println("\n");
    }

     7. Print 1 to 10 using do-while loop
    public static void printOneToTenDoWhile() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println("\n");
    }

     8. Find Armstrong number or not (for 3-digit number)
    public static void checkArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
        System.out.println();
    }

    9. Check prime or not
    public static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is NOT a prime number.");
            System.out.println();
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is a prime number." : " is NOT a prime number."));
        System.out.println();
    }

   10. Check palindrome or not
    public static void checkPalindrome(int num) {
        int originalNum = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(originalNum + (originalNum == reversed ? " is a palindrome." : " is NOT a palindrome."));
        System.out.println();
    }

     11. Check EVEN or ODD using switch (using remainder)
    public static void evenOddSwitch(int num) {
        switch (num % 2) {
            case 0:
                System.out.println(num + " is EVEN.");
                break;
            case 1:
                System.out.println(num + " is ODD.");
                break;
        }
        System.out.println();
    }

     12. Print gender (Male/Female) according to given M/F using switch
    public static void printGender(char gender) {
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender is Male.");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender is Female.");
                break;
            default:
                System.out.println("Invalid gender input.");
        }
        System.out.println();
    }

     13. Multiple if else (Largest number in 10, 20, 30)
    public static void multipleIfElseLargest() {
        int a = 10, b = 20, c = 30;
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBrightITCareer();
        printOneToTwenty();
        equalAndNotEqualOperators(10, 20);
        printOddEvenNumbers();
        printLargestNumber(15, 25, 10);
        printEvenBetween10And100();
        printOneToTenDoWhile();
        checkArmstrong(153);
        checkArmstrong(123);
        checkPrime(29);
        checkPrime(15);
        checkPalindrome(121);
        checkPalindrome(123);
        evenOddSwitch(22);
        evenOddSwitch(33);
        printGender('M');
        printGender('f');
        printGender('X');
        multipleIfElseLargest();
    }
}
