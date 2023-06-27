package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Rectangle rectangle = new Rectangle(5, 4);
        myShape = rectangle;
        System.out.println("Rectangle box1");
//        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());

        Square square = new Square(5);
        myShape = square;
        System.out.println("\nSquare box2");
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());
    }
}
// Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
// because the Rectangle class extends the Quadrilateral abstract class, which in turn implements the Measurable interface. The Measurable interface defines the contract that any class implementing it must provide implementations for all its methods.

// What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
// If you try to call the getLength or getWidth methods of the myShape variable, it will result in a compilation error. This is because the myShape variable is declared with the type Measurable, which is an interface.