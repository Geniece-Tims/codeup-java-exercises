import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        // Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
        String[] adjectives = {
                "attractive",
                "brave",
                "clumsy",
                "dazzling",
                "eager",
                "fierce",
                "gorgeous",
                "happy",
                "itchy",
                "zealous"
        };

        String[] nouns = {
                "fork",
                "dish",
                "goat",
                "dove",
                "man",
                "child",
                "boat",
                "ship",
                "ambulance",
                "bottle"
        };
        // Create a method that will return a random element from an array of strings.
        String randomAdjective = getRandomElement(adjectives);
        System.out.println("The random adjective selected is: " + randomAdjective);

        String randomNoun = getRandomElement(nouns);
        System.out.println("The random noun selected is: " + randomNoun);
        // Add a main method, and inside your main method select a random noun and adjective and hyphenate the combination and display the generated name to the user.
        String generateName = randomAdjective + "-" + randomNoun;
        System.out.println("Here is your new server name: " + generateName);
    }

    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }
}
