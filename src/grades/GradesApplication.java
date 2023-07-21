package grades;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Kayla");
        Student student2 = new Student("Joan");
        Student student3 = new Student("Riley");

        student1.addGrade(85);
        student1.addGrade(93);
        student1.addGrade(78);

        student2.addGrade(89);
        student2.addGrade(100);
        student2.addGrade(82);

        student3.addGrade(94);
        student3.addGrade(91);
        student3.addGrade(89);


        students.put("kaylaWayla", student1);
        students.put("joanieJoan", student2);
        students.put("rileyWiley", student3);


        Input in = new Input();
        boolean resp = true;
        while (resp) {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students: \n" );

            String s = "";
            for (String key : students.keySet()) {
                s += " | " + key;
            }
            System.out.println(s + " | \n");

            System.out.print("Which student would you like to see more information about?");

            String userInput = in.getString();

            if (students.containsKey(userInput)) {
                System.out.printf("Student Name: \"%s\"; %nStudent GitHub Username: \"%s\"; %nStudent Grade Average: %.2f;%n",
                        students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());

//                students.get(userInput).getName();
//                userInput;
//                students.get(userInput).getGradeAverage();
            } else {
                System.out.println("I'm sorry, but that username is not valid.");
            }
            System.out.println("Do you wish to continue?\n");

            resp = in.yesNo();

        }
        System.out.println("Thank you have a great day!");

    }
}