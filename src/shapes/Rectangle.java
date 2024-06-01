package shapes;

public class Rectangle extends AbstractShape {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide,
                     double secondSide,
                     String colorOfBorder,
                     String colorOfShape) {
        super("Rectangle", colorOfBorder, colorOfShape);
        if (firstSide <= 0 || secondSide <= 0) {
            throw new IllegalArgumentException("Sides can not be zero or negative");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle(double firstSide, double secondSide) {
        this(firstSide, secondSide, "Green", "White");
    }

    @Override
    public double countPerimeter() {
        return 2.0 * firstSide + 2.0 * secondSide;
    }

    @Override
    public double countArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shapeType='" + shapeType + '\'' +
                ", colorOfBorder='" + colorOfBorder + '\'' +
                ", colorOfShape='" + colorOfShape + '\'' +
                '}';
    }
}
