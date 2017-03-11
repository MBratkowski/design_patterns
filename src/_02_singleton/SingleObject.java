package _02_singleton;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showInitalMessage() {
        System.out.println("Hello world");
    }
}
