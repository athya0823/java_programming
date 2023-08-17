public class AmericanFlag {
    public static void main(String[] args) {
        int rows = 13;
        int cols = 13 * 2; // Adjust according to the desired proportion
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    if (j % 4 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
