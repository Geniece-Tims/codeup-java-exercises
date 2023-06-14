// has to be at the top of your code when using Scanner & InputMismatchException
import java.util.InputMismatchException;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);
        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        try {
            System.out.println("Enter something: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter an integer.");
        }

        // Explore the Scanner Class
        System.out.println("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("You entered: ");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        System.out.println("Enter a sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // Calculate the perimeter and area of Codeup's classrooms.
        System.out.println("Enter the length of the classroom: ");
        String lengthInput = scanner.nextLine();
        System.out.println("Enter the width of the classroom: ");
        String widthInput = scanner.nextLine();
        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}