package _04_prototype;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
