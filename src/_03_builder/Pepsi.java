package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
