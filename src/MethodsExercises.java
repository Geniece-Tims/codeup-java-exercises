import java.util.Scanner;

public class MethodsExercises {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by 0");
        }
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Invalid input! Please try again.");
            return getInteger(min, max);
        }

        return userInput;
    }

    public static long calculateFactorial(int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

//    public static long findMaxFactorialNum() {
//        long maxFactorialNum = 1;
//        long factorial = 1;
//
//        while (true) {
//            try {
//                factorial *= maxFactorialNum;
//                maxFactorialNum++;
//            } catch (ArithmeticException e) {
//                break;
//            }
//        }
//
//        return maxFactorialNum - 1;
//    }
        public static int rollDice(int sides) {
            return (int) (Math.random() * sides) + 1;
        }

    public static void playGame() {
        int randomNumber = rollDice(100);

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            System.out.print("Take a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Addition: " + result);

        result = subtract(5, 3);
        System.out.println("Subtraction: " + result);

        result = multiplication(5, 3);
        System.out.println("Multiplication: " + result);

        result = division(25, 5);
        System.out.println("Division: " + result);

        int userInput = getInteger(1, 20);
        System.out.println("Valid input: " + userInput);

        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;
//        long maxFactorialNum = findMaxFactorialNum();


        while (continueCalculation) {
            System.out.print("Enter an integer between 1 and 10: ");
            userInput = scanner.nextInt();
//            System.out.println("Enter an integer between 1 and " + maxFactorialNum + ": ");
//            userInput = getInteger(1, (int) maxFactorialNum);
//            long factorial = calculateFactorial(userInput);
//            System.out.println(userInput + "! = " + factorial);

            if (userInput >= 1 && userInput <= 10) {
                long factorial = calculateFactorial(userInput);
                System.out.println(userInput + "! = " + factorial);
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 10.");
            }

            System.out.println("Do you want to continue (y/n)?");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y")) {
                continueCalculation = false;
            }
        }

        System.out.println("Factorial calculation ended.");

        System.out.print("Enter the number of sides for a pair of dice: ");
        int sides = scanner.nextInt();

        boolean continueRolling = true;

        while (continueRolling) {
            int dice1 = rollDice(sides);
            int dice2 = rollDice(sides);

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            System.out.print("Do you want to roll the dice again? (y/n): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y")) {
                continueRolling = false;
            }
        }

        System.out.println("Dice rolling simulation ended.");

        System.out.println("Welcome to the High-Low guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        playGame();

        System.out.println("Thank you for playing!");
    }
}


// ---------------------------------------------------------------------------------------------------------------------------------------------------
        // Bonus #1, Pt. 1:
        //  a. Create your multiplication method without the * operator (Hint: a loop might be helpful).
        //  b. Do the above with recursion.
//    public static int multiplicationLoop(int a, int b) {
//        int result = 0;
//        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
//        a = Math.abs(a);
//        b = Math.abs(b);
//
//        for(int i = 0; i < b; i++) {
//            result += a;
//        }
//        return isNegative ? -result : result;
//    }
//
//    public static int modulus(int a, int b) {
//        return a % b;
//    }

        // Bonus #1, Pt. 2:
        //  a. Create your multiplication method without the * operator (Hint: a loop might be helpful).
        //  b. Do the above with recursion.

//        int multiplicationLoopResult = multiplicationLoop(9, 8);
//        System.out.println("Multiplication using a loop is: " + multiplicationLoopResult);
// ---------------------------------------------------------------------------------------------------------------------------------------------------


