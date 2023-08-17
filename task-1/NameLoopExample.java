import java.util.Scanner;

public class NameLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a name (or 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break; // Exit the loop
            }
            
            System.out.println("You entered: " + input);
        }
        
        scanner.close();
    }
}
