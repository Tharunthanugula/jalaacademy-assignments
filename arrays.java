import java.util.*;

public class JalaArrays {

     1. Add integer values of an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    2. Calculate average value of an array
    public static double averageArray(int[] arr) {
        return arr.length == 0 ? 0 : (double) sumArray(arr) / arr.length;
    }

     3. Find index of an array element (-1 if not found)
    public static int indexOf(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == val) return i;
        return -1;
    }

     4. Test if array contains a specific value
    public static boolean containsValue(int[] arr, int val) {
        return indexOf(arr, val) != -1;
    }

    // 5. Remove a specific element from an array (returns new array)
    public static int[] removeElement(int[] arr, int val) {
        return Arrays.stream(arr).filter(n -> n != val).toArray();
    }

    6. Copy an array to another array
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

     7. Insert an element at specific position in array (returns new array)
    public static int[] insertElement(int[] arr, int val, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) newArr[i] = val;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    8. Find min and max value of array
    public static int[] minMax(int[] arr) {
        if (arr.length == 0) return new int[]{};
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new int[]{min, max};
    }

     9. Reverse an array of integers
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    }

    10. Find duplicate values of an array
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int n : arr) {
            if (!seen.add(n)) duplicates.add(n);
        }
        return duplicates;
    }

     11. Find common values between two arrays
    public static Set<Integer> commonValues(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : arr1) set1.add(n);
        Set<Integer> commons = new HashSet<>();
        for (int n : arr2) {
            if (set1.contains(n)) commons.add(n);
        }
        return commons;
    }

     12. Remove duplicate elements from an array (returns new array)
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

     13 & 14. Find second largest number in an array
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1; // not enough elements
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

     15. Count even and odd numbers in array
    public static int[] countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int n : arr) {
            if (n % 2 == 0) even++; else odd++;
        }
        return new int[]{even, odd};
    }

    16. Get difference between largest and smallest value
    public static int diffMaxMin(int[] arr) {
        int[] mm = minMax(arr);
        return mm.length == 2 ? mm[1] - mm[0] : 0;
    }

     17. Verify if array contains two specified elements (12 and 23)
    public static boolean containsTwoValues(int[] arr, int val1, int val2) {
        boolean foundVal1 = false, foundVal2 = false;
        for (int n : arr) {
            if (n == val1) foundVal1 = true;
            if (n == val2) foundVal2 = true;
        }
        return foundVal1 && foundVal2;
    }


    19. Find missing number in sorted array of 1 to 100
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // should be 100 if one number missing
        int expectedSum = n * (n + 1) / 2; // sum of 1..n+1
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }

     Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 12, 23, 12, 100, 5, 7};
        int[] sortedArrWithMissing = new int[99];
        for (int i = 0, j = 1; i < 99; i++, j++) {
            if (j == 57) j++; // skip 57
            sortedArrWithMissing[i] = j;
        }

        System.out.println("Sum of array: " + sumArray(arr));
        System.out.println("Average of array: " + averageArray(arr));
        System.out.println("Index of 12: " + indexOf(arr, 12));
        System.out.println("Contains 23? " + containsValue(arr, 23));
        System.out.println("Remove element 3: " + Arrays.toString(removeElement(arr, 3)));
        System.out.println("Copy array: " + Arrays.toString(copyArray(arr)));
        System.out.println("Insert 50 at position 2: " + Arrays.toString(insertElement(arr, 50, 2)));
        int[] mm = minMax(arr);
        System.out.println("Min: " + mm[0] + ", Max: " + mm[1]);
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(arr)));
        System.out.println("Duplicates: " + findDuplicates(arr));
        System.out.println("Common values with {5, 12, 50}: " + commonValues(arr, new int[]{5, 12, 50}));
        System.out.println("Remove duplicates: " + Arrays.toString(removeDuplicates(arr)));
        System.out.println("Second largest: " + secondLargest(arr));
        int[] counts = countEvenOdd(arr);
        System.out.println("Even count: " + counts[0] + ", Odd count: " + counts[1]);
        System.out.println("Difference max-min: " + diffMaxMin(arr));
        System.out.println("Contains 12 and 23? " + containsTwoValues(arr, 12, 23));
        System.out.println("Remove duplicates again: " + Arrays.toString(removeDuplicates(arr)));
        System.out.println("Missing number in 1 to 100 array: " + findMissingNumber(sortedArrWithMissing));
    }
}
