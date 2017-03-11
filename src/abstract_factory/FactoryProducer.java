package abstract_factory;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            throw new IllegalArgumentException("Invalid choice");
        }
    }
}
