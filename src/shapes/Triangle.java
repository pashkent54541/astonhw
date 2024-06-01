package shapes;

public class Triangle extends AbstractShape {

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide,
                    double secondSide,
                    double thirdSide,
                    String colorOfBorder,
                    String colorOfShape) {
        super("Triangle", colorOfBorder, colorOfShape);
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new IllegalArgumentException("Any side can not be zero or negative");
        }
        if (!(firstSide + secondSide > thirdSide)
                || !(secondSide + thirdSide > firstSide)
                || !(thirdSide + firstSide > secondSide)) {
            throw new IllegalArgumentException("There is no such triangle");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this(firstSide, secondSide, thirdSide, "Brown", "Yellow");
    }

    @Override
    public double countPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double countArea() {
        double halfPerimeter = 0.5 * countPerimeter();
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide)
                * halfPerimeter * (halfPerimeter - secondSide)
                * halfPerimeter * (halfPerimeter - secondSide));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeType='" + shapeType + '\'' +
                ", colorOfBorder='" + colorOfBorder + '\'' +
                ", colorOfShape='" + colorOfShape + '\'' +
                '}';
    }
}
