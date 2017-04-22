package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        meal.addItem(new VegBurger());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new Pepsi());
        meal.addItem(new ChickenBurger());
        return meal;
    }
}
