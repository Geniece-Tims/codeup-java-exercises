import java.util.Scanner;

public class HighLow {
    public static final Scanner scanner = new Scanner(System.in);
    public static int getInteger(int min, int max) {
        System.out.printf("Please enter an integer between %d and $d.%n", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            System.out.println("Invalid input. Number out of range.");
            return getInteger(min, max);
        } else {
            System.out.println("Thank you.");
            return userNum;
        }
    }
    public static void playGame() {
        int magicNum = (int) Math.floor(Math.random() * 100) + 1;
        int userNum;
        System.out.println("Welcome to Number Guesser!");
        do {
            userNum = getInteger(1, 100);
            if (userNum > magicNum) {
                System.out.println("LOWER");
            } else if (userNum < magicNum) {
                System.out.println("HIGHER");
            } else {
                System.out.println("GREAT GAME!");
            }
        } while (userNum != magicNum);
        System.out.println("Don't you want a rematch?");
        scanner.nextLine();
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            playGame();
        }
    }
    public static void main(String[] args) {
        playGame();
    }
}
