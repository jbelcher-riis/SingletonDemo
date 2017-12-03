package SimpleFactory;

public class SimpleFactoryDemo {

    SimpleShapeFactory factory;

    public SimpleFactoryDemo(SimpleShapeFactory factory) {
	this.factory = factory;
    }

    public void talk(ShapeType shapeType) throws Exception {
	final Shape shape = factory.makeShape(shapeType);

	shape.sayMyName();
    }
}
