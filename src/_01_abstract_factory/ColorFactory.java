package _01_abstract_factory;

import _01_abstract_factory.color.Blue;
import _01_abstract_factory.color.Green;
import _01_abstract_factory.color.Red;
import _01_abstract_factory.color.definition.Color;
import _01_abstract_factory.shape.definition.Shape;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }

        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else {
            throw new IllegalArgumentException("Invalid color type");
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
