package abstract_factory.color;

import abstract_factory.color.definition.Color;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Color the blue");
    }
}
