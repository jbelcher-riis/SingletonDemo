import SimpleFactory.ShapeType;
import SimpleFactory.SimpleFactoryDemo;
import SimpleFactory.SimpleShapeFactory;
import SimpleFactory.SimpleShapeFactoryImpl;

public class PatternDemo {

    public static void main(String[] args) throws Exception {
	final SimpleShapeFactory factory = new SimpleShapeFactoryImpl();

	final SimpleFactoryDemo demo = new SimpleFactoryDemo(factory);

	demo.talk(ShapeType.CIRCLE);
	demo.talk(ShapeType.SQUARE);
    }

}
