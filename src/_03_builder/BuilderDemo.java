package _03_builder;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("Veg mealn");
        vegMeal.showItems();
        System.out.println("Total cost:" + String.valueOf(vegMeal.getCost()));

        Meal nonVegaMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non vega meal");
        nonVegaMeal.showItems();
        System.out.println("Total cost:" + String.valueOf(nonVegaMeal.getCost()));
    }

}
