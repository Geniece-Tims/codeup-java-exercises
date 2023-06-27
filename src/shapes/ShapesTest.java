package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Rectangle box1");
        System.out.println("Perimeter: " + box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("\nSquare box2");
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());
    }
}
// How can you determine which getArea and getPerimeter methods are being called on each object?
// by printing out the results to determine which getArea() and getPerimeter() is being called. Ex. if the area and perimeter values match the
// function calculations specific to the Rectangle class, it means that the Rectangle class methods are being called. If the value matching the
// calculations specific to the Square class, it means the overridden methods in Square are being called.