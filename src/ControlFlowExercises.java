import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1. Loop Basics
        //  a. While
        //      Create an integer variable i with a value of 5.
        //      Create a while loop that runs so long as i is less than or equal to 15
        //      Each loop iteration, output the current value of i, then increment i by one.
        //
        //      Your output should look like this:
        //      5 6 7 8 9 10 11 12 13 14 15
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        // b. Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int num = 0;
        do {
            System.out.println(num);
            num += 2;
        } while (num <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
        int countBackwards = 100;
        do {
            System.out.println(countBackwards);
            countBackwards -=5;
        } while (countBackwards >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        int startsAt = 2;
        do {
            System.out.println(startsAt);
            startsAt *= 2;
        } while (startsAt < 1000000 );

        // c. For
        // Refactor the previous two exercises to use a for loop instead.

        // First While Loop function using variable "j" since i has already been declared.
        for(int j = 5; j <= 15; j++) {
            System.out.println("j is " + j);
        }

        for(int number = 0; number <= 100; number += 2) {
            System.out.println(number);
        }

        for(int backwardsByFive = 100; backwardsByFive >= -10; backwardsByFive -= 5) {
            System.out.println(backwardsByFive);
        }

        for(int beginAt = 2; beginAt < 1000000; beginAt *= 2) {
            System.out.println(beginAt);
        }

        // 2. Fizzbuzz
        // Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

        for(int fb = 1; fb <= 100; fb++) {
            if (fb % 3 == 0) {
                System.out.println("Fizz");
            } else if (fb % 5 == 0) {
                System.out.println("Buzz");
            } else if (fb % 3 == 0 && fb % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(fb);
            }

        }

        // 3. Display a table of powers.
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Enter an integer: ");
        String integerInput = scanner.nextLine();

    }
}

