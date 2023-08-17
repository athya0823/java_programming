public class SingleDuplicateExample {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2}; // Example array with a single duplicate
        int singleDuplicate = findSingleDuplicate(array);
        
        if (singleDuplicate != -1) {
            System.out.println("The single duplicate is: " + singleDuplicate);
        } else {
            System.out.println("No single duplicate found.");
        }
    }
    
    public static int findSingleDuplicate(int[] nums) {
        int n = nums.length - 1;
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return actualSum - sum;
    }
}
