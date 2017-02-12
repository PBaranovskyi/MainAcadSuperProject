package brainsuper.practice10.clone;

/**
 * Created by citsym on 12.02.17.
 */
public class Engine implements Cloneable {
    double value = 1.6;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
