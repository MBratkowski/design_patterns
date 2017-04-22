package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
