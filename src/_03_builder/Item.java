package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
