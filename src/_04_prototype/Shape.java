package _04_prototype;

/**
 * Created by mateuszbratkowski on 22/04/2017.
 */
public abstract class Shape implements Cloneable {

    protected String type;
    private String id;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {

        }
        return object;
    }
}
