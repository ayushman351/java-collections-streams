package set_interface;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        // Check if two sets are equal
        System.out.println("Are sets equal? " + set1.equals(set2));

        // Union and Intersection
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Symmetric Difference
        Set<Integer> symmetricDiff = new HashSet<>(union);
        symmetricDiff.removeAll(intersection);
        System.out.println("Symmetric Difference: " + symmetricDiff);

        // Convert a Set to a Sorted List
        Set<Integer> unsortedSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> sortedList = new ArrayList<>(unsortedSet);
        Collections.sort(sortedList);
        System.out.println("Sorted List: " + sortedList);

        // Find Subsets
        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is subset? " + superset.containsAll(subset));
    }
}
