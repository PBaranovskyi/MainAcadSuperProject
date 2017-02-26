package brainsuper.practice10.clone;


import brainsuper.practice11.vehicle.Engine;

import java.util.Date;

/**
 * Created by citsym on 12.02.17.
 */
public class Car implements Cloneable {
    protected int maxSpeed;
    protected Date manufDate;
    Engine engine = new Engine();

    public Car(Date manufDate, int maxSpeed) {
        this.manufDate = manufDate;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Max Speed = " + maxSpeed +
                " Manufacture date = " + manufDate + " " + engine;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.engine = (Engine) this.engine.clone();
        return clonedCar;
    }
}
