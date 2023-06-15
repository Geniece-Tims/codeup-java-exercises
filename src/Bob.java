import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        // 2. Create a class named Bob with a main method for the following exercise.
        //    Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //    He answers 'Whatever.' to anything else.
        // Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Bob: Hi, how can I help you?");
        System.out.print("User: ");
        while (!(input = scanner.nextLine()).equalsIgnoreCase("bye")) {
            System.out.print("Bob: ");
            String response = generateResponse(input);
            System.out.println(response);
            System.out.print("User: ");
        }
        System.out.println("Bob: Goodbye!");
    }

    private static String generateResponse (String input) {
        if (input.trim().isEmpty()) {
            return "Fine. Be that way!";
        } else if (input.endsWith("?")) {
            return "Sure.";
        } else if (input.endsWith("!")) {
            return "Whoa, chill out!";
        } else {
            return "Whatever.";
        }
    }
}
