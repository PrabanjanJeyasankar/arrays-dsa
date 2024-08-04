import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsFrequency {
    public static void main(String[] args) {
        // Test cases
        int[] testCase1 = {1, 4, 7, 1, 5, 4 , 7, 5, 1}; // Multiple duplicates
        int[] testCase2 = {1, 2, 3, 4, 5}; // All unique
        int[] testCase3 = {2, 2, 2, 2}; // All same
        int[] testCase4 = {}; // Empty array
        int[] testCase5 = {0, -1, -1, 0, -2}; // Includes negative numbers and zero
        int[] testCase6 = {1}; // Single element

        findFrequencyOfDuplicateElements(testCase1);
        System.out.println();
        findFrequencyOfDuplicateElements(testCase2);
        System.out.println();
        findFrequencyOfDuplicateElements(testCase3);
        System.out.println();
        findFrequencyOfDuplicateElements(testCase4);
        System.out.println();
        findFrequencyOfDuplicateElements(testCase5);
        System.out.println();
        findFrequencyOfDuplicateElements(testCase6);
    }

    private static void findFrequencyOfDuplicateElements(int[] array) {
        if (array.length == 0) {
            System.out.println("Input is empty.");
            return;
        }

        if (array.length == 1) {
            System.out.println("No duplicates in array with a single element.");
            return;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        boolean hasDuplicates = false;
        System.out.println("Element  Frequency");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                hasDuplicates = true;
                System.out.println(entry.getKey() + "        " + entry.getValue());
            }
        }
        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
