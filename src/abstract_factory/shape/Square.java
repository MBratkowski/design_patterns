package abstract_factory.shape;

import abstract_factory.shape.definition.Shape;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw the square shape");
    }
}
