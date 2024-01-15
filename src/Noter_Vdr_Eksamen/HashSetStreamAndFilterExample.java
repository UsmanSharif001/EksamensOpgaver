package Noter_Vdr_Eksamen;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetStreamAndFilterExample {
    public static void main(String[] args) {

        // Create a HashSet
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Ants");
        stringSet.add("Ananas");
        stringSet.add("Arange");

        // Stream operations on the HashSet
        System.out.println("Original Set: " + stringSet);

        // Convert the HashSet to uppercase using stream

        Set<String> uppercaseSet = stringSet.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println("Uppercase Set: " + uppercaseSet);

        // Filter elements in the HashSet based on a condition

        Set<String> filteredSet = stringSet.stream().filter(setFruit -> setFruit.startsWith("A")).collect(Collectors.toSet());
        System.out.println("Following fruits starts with A: ");
        filteredSet.forEach(s -> System.out.print( s + " "));

        List<String> filteredSet1 = stringSet.stream()
                .filter(s -> s.endsWith("e"))
                .toList();

      //  List<String> compareName = stringSet.stream().sorted(Comparator.comparing(KLASSENAVN::DENSMETODE).thenComparing(KLASSENAVN::DENSMETODE)).toList();

        System.out.println("Filtered endsWith: " + filteredSet1);
    }
}