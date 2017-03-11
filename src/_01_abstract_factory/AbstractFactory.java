package _01_abstract_factory;

import _01_abstract_factory.color.definition.Color;
import _01_abstract_factory.shape.definition.Shape;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
