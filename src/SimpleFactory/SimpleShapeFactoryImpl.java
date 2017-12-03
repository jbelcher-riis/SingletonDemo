package SimpleFactory;

public class SimpleShapeFactoryImpl implements SimpleShapeFactory {

    @Override
    public Shape makeShape(ShapeType shapeType) throws Exception {
	switch (shapeType) {
	case SQUARE:
	    return new Square();
	case CIRCLE:
	    return new Circle();
	}

	throw new Exception("unknown shape type");
    }

}
