import java.util.HashMap;
import java.util.Map;

public class NonUniqueDuplicateExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3};
        int nonUniqueDuplicate = findNonUniqueDuplicate(array);
        
        if (nonUniqueDuplicate != -1) {
            System.out.println("The first non-unique duplicate is: " + nonUniqueDuplicate);
        } else {
            System.out.println("No non-unique duplicate found.");
        }
    }
    
    public static int findNonUniqueDuplicate(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            if (frequencyMap.get(num) > 1) {
                return num;
            }
        }
        
        return -1; // No non-unique duplicate found
    }
}
