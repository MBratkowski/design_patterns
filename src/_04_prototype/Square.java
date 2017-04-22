package _04_prototype;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
