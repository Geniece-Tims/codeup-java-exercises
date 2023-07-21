package grades;

import java.text.DecimalFormat;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Kayla");
        Student student2 = new Student("Joan");
        Student student3 = new Student("Riley");
        Student student4 = new Student("Guy");
        Student student5 = new Student("Asher");

        student1.addGrade(85);
        student1.addGrade(93);
        student1.addGrade(78);

        student2.addGrade(89);
        student2.addGrade(100);
        student2.addGrade(82);

        student3.addGrade(94);
        student3.addGrade(91);
        student3.addGrade(89);

        student4.addGrade(72);
        student4.addGrade(83);
        student4.addGrade(0);

        student5.addGrade(58);
        student5.addGrade(91);
        student5.addGrade(69);

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        System.out.println(student1.getName() + "'s average grade is: " + decimalFormat.format(student1.getGradeAverage()) + "%");
        System.out.println(student2.getName() + "'s average grade is: " + decimalFormat.format(student2.getGradeAverage()) + "%");
        System.out.println(student3.getName() + "'s average grade is: " + decimalFormat.format(student3.getGradeAverage()) + "%");
        System.out.println(student4.getName() + "'s average grade is: " + decimalFormat.format(student4.getGradeAverage()) + "%");
        System.out.println(student5.getName() + "'s average grade is: " + decimalFormat.format(student5.getGradeAverage()) + "%");



    }
}
