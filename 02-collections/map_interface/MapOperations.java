package map_interface;

import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        // Word Frequency Counter Example
        String text = "Hello world, hello Java!";
        System.out.println("Word Frequency: " + wordFrequency(text));

        // Invert a Map Example
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);
        System.out.println("Inverted Map: " + invertMap(inputMap));

        // Find Key with Highest Value Example
        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("A", 10);
        valueMap.put("B", 20);
        valueMap.put("C", 15);
        System.out.println("Key with Highest Value: " + keyWithHighestValue(valueMap));

        // Merge Two Maps Example
        Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1, "B", 2));
        Map<String, Integer> map2 = new HashMap<>(Map.of("B", 3, "C", 4));
        System.out.println("Merged Map: " + mergeMaps(map1, map2));

        // Group Objects by Property Example
        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );
        System.out.println("Grouped Employees: " + groupByDepartment(employees));
    }

    // Word Frequency Counter
    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        for (String word : text.split(" ")) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        return frequencyMap;
    }

    // Invert a Map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return invertedMap;
    }

    // Find the Key with the Highest Value
    public static <K> K keyWithHighestValue(Map<K, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    // Merge Two Maps
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);
        map2.forEach((key, value) -> merged.merge(key, value, Integer::sum));
        return merged;
    }

    // Group Employees by Department
    static class Employee {
        String name;
        String department;
        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
        return grouped;
    }
}
