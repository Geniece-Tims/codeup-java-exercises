public class StringExercise {
    public static void main(String[] args) {
        // 1. String Basics
        //      For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you
        //      can do this with only one String variable and one print statement for each output example.

        // We don't need no education
        // We don't need no thought control
        String dontNeed = "We don't need no education";
        String replaced = dontNeed.replace("no education", "no thought control");
        System.out.println(replaced);

        // Check "this" out!, "s inside of "s!
        String sentence = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(sentence);

        // In windows, the main drive is usually C:\
        String mainDrive = "In windows, the main drive is usually 'C':\\";
        System.out.println(mainDrive);

        // I can do backslashes \, double backslashes \\,
        //and the amazing triple backslash \\\!
        String backslash = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(backslash);

        // Bob.java is for Question 2.

    }

}
