
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for a number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        // If the number is positive print "The number is positive"
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            // If the number is not positive print "The number is not positive."
            System.out.println("The number is not positive.");
        }

    }
}
