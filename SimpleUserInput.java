import java.util.Scanner;

public class SimpleUserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");

        // Read the integer input from the user
        int userInput = scanner.nextInt();

        // Perform the manipulation (double the input)
        int doubledValue = userInput * 2;

        
        System.out.println("Doubled value: " + doubledValue);

        
        scanner.close();
    }
}
