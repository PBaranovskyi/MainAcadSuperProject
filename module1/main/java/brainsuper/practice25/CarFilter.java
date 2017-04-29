package brainsuper.practice25;

import brainsuper.practice19.Car;

/**
 * Created by citsym on 29.04.17.
 */
@FunctionalInterface
public interface CarFilter {

    boolean filter(Car car);

}
