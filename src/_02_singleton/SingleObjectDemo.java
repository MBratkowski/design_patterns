package _02_singleton;

/**
 * Created by mateuszbratkowski on 11/03/2017.
 */
public class SingleObjectDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showInitalMessage();
    }
}
