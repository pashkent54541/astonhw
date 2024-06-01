package shapes;

public abstract class AbstractShape implements PerimeterAndArea {

    protected final String shapeType;
    protected final String colorOfBorder;
    protected final String colorOfShape;

    protected AbstractShape(String shapeType, String colorOfBorder, String colorOfShape) {
        this.shapeType = shapeType;
        this.colorOfBorder = colorOfBorder;
        this.colorOfShape = colorOfShape;
    }


}
