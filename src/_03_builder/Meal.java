package _03_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class Meal {

    private List<Item> mealList = new ArrayList<>();

    public void addItem(Item item) {
        mealList.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : mealList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : mealList) {
            System.out.println("Item: " + item.name());
            System.out.println("Price: " + item.price());
            System.out.println("Packing: " + item.packing().pack());
        }
    }
}
