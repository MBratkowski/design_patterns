package abstract_factory;

import abstract_factory.color.definition.Color;
import abstract_factory.shape.definition.Shape;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactor = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactor.getShape("CIRCLE");
        circle.draw();

        Shape square = shapeFactor.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();
    }
}
