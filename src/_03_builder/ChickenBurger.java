package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
