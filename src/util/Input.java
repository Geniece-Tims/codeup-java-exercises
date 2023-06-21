package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input input = new Input();

        String name = input.getString();
        System.out.println("Name: " + name);

        boolean choice = input.yesNo();
        System.out.println("Choice: " + choice);

        int numRange = input.getInt(1, 10);
        System.out.println("Number in range: " + numRange);

        int num = input.getInt();
        System.out.println("Number: " + num);

        double decimalRange = input.getDouble(0.0, 1.0);
        System.out.println("Decimal in range: " + decimalRange);

        double decimal = input.getDouble();
        System.out.println("Decimal: " + decimal);
    }
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.printf("Invalid input. Please enter an integer between %d and %d: ", min, max);
                scanner.next();
            }
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public int getInt() {
        System.out.print("Please enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.printf("Invalid input. Please enter a decimal number between %f and %f: ", min, max);
                scanner.next();
            }
            num = scanner.nextDouble();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;
    }

    public double getDouble() {
        System.out.print("Please enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a decimal number: ");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

// Bonus:

    public String getString(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return num;
    }

    public int getInt(int min, int max, String prompt) {
        if (prompt != null) {
            System.out.printf("%s (between %d and %d): ", prompt, min, max);
        }
        int num;
        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }
            num = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } while (num < min || num > max);
        return num;
    }

    public double getDouble(String prompt) {
        if (prompt != null) {
            System.out.print(prompt);
        }
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a decimal number: ");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

    public double getDouble(double min, double max, String prompt) {
        if (prompt != null) {
            System.out.printf("%s (between %f and %f): ", prompt, min, max);
        }
        double num;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a decimal number: ");
                scanner.next();
            }
            num = scanner.nextDouble();
            scanner.nextLine();
        } while (num < min || num > max);
        return num;

    }

}
