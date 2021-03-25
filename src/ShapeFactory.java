
public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapetype) {
		if (shapetype == null) {
			return null;
		}
		
		if (shapetype.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapetype.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapetype.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapetype.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}
}
