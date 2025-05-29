import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

         1. ArrayList Operations
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add("Element" + i);
        }

        System.out.println("Original ArrayList: " + list);

        list.add("NewElement");
        System.out.println("After adding an element: " + list);

        System.out.print("Iterating with Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        list.add(5, "InsertedAt5");
        System.out.println("After adding element at index 5: " + list);

        list.remove("Element3");
        System.out.println("After removing 'Element3': " + list);

        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        list.set(4, "UpdatedAt4");
        System.out.println("After updating element at index 4: " + list);

        System.out.println("Element at index 3: " + list.get(3));

        System.out.println("Size of ArrayList: " + list.size());

        System.out.println("Is 'Element7' present? " + list.contains("Element7"));

        list.clear();
        System.out.println("After removing all elements: " + list);

        System.out.println("------------------------------------------------");

         2. HashMap Operations
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add 10 key-value pairs (Student ID and Name)
        for (int i = 1; i <= 10; i++) {
            studentMap.put(i, "Student" + i);
        }

        System.out.println("Original HashMap: " + studentMap);

        studentMap.put(11, "Student11");
        System.out.println("After adding key 11: " + studentMap);

        System.out.println("Value for key 5: " + studentMap.get(5));

        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned HashMap: " + cloneMap);

        System.out.println("Contains key 7? " + studentMap.containsKey(7));

        System.out.println("Contains value 'Student9'? " + studentMap.containsValue("Student9"));

        System.out.println("Is map empty? " + studentMap.isEmpty());

        System.out.println("Size of map: " + studentMap.size());

        System.out.println("All keys: " + studentMap.keySet());

        System.out.println("All values: " + studentMap.values());

        studentMap.remove(3);
        System.out.println("After removing key 3: " + studentMap);

        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("Copied map: " + anotherMap);

        System.out.println("------------------------------------------------");

         3. HashSet Operations
        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            set.add("SetElement" + i);
        }
        System.out.println("Original HashSet: " + set);

        set.add("NewSetElement");
        System.out.println("After adding new element: " + set);

        System.out.println("Contains 'SetElement5'? " + set.contains("SetElement5"));

        set.remove("SetElement3");
        System.out.println("After removing 'SetElement3': " + set);

        System.out.print("Iterating HashSet: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Size of HashSet: " + set.size());

         Check if set is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

         Remove all elements
        set.clear();
        System.out.println("After clearing HashSet: " + set);
    }
}
