package _01_abstract_factory;

import _01_abstract_factory.color.definition.Color;
import _01_abstract_factory.shape.Circle;
import _01_abstract_factory.shape.Square;
import _01_abstract_factory.shape.definition.Shape;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
