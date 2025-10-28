import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        // Check that number is between 1 and 15
        if (number < 1 || number > 15) {
            System.out.println("Enter a  number between 1 and 15.");
            System.exit(1);
        }

        // Display pyramid - build rows
        for (int i = 1; i <= number; i++) {
            // Print spaces
            for (int j = 0; j < number - i; j++) {
                System.out.print("   "); // 3 spaces between our numbers
            }

            // address the left half of the problem - decreasing order
            for (int k = i; k > 1; k--) {
                System.out.printf("%2d ", k);
            }

            // increasing order from center to right - right half
            for (int m = 1; m <= i; m++) {
                System.out.printf("%2d ", m);
            }

            // Move to the next line
            System.out.println();
        }

        input.close();
    }
}
