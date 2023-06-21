package shapes;

import util.Input;

public class CircleApp {
    private static int totalCircles = 0;

    public static void main(String[] args) {
        Input input = new Input();

        do {
            double radius = input.getDouble("Enter the radius of the circle: ");
            Circle circle = new Circle(radius);

            System.out.println("Circle Circumference: " + circle.getCircumference());
            System.out.println("Circle Area: " + circle.getArea());

            totalCircles++;

        } while (input.yesNo("Do you want to create another circle?"));

        System.out.println("Total circles created: " + getTotalCircles());
    }

    private static int getTotalCircles() {
        return totalCircles;
    }
}