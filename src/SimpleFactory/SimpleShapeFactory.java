package SimpleFactory;

public interface SimpleShapeFactory {
    public Shape makeShape(ShapeType shapeType) throws Exception;
}
