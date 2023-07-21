package shapes;

public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.getLength();
    }

    @Override
    public double getArea() {
        return super.getLength() * super.getLength();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
