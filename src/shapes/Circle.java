package shapes;

public class Circle extends AbstractShape {

    private final double PI = 3.14;
    private final double radius;

    public Circle(double radius, String colorOfBorder, String colorOfShape) {
        super("Circle", colorOfBorder, colorOfShape);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius can not be 0 or negative");
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        this(radius,"Brown","White");
    }

    @Override
    public double countPerimeter() {
        return 2.0 * PI * radius;
    }

    @Override
    public double countArea() {
        return 2.0 * PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeType='" + shapeType + '\'' +
                ", colorOfBorder='" + colorOfBorder + '\'' +
                ", colorOfShape='" + colorOfShape + '\'' +
                '}';
    }
}
