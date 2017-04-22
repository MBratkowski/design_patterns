package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
