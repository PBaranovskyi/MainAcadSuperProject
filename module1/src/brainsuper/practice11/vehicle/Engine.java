package brainsuper.practice11.vehicle;

/**
 * Created by citsym on 12.02.17.
 */
public class Engine implements Cloneable {
    double value = 1.6;

    public Engine(int value) {
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
