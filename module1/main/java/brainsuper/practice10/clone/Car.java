package brainsuper.practice10.clone;


import brainsuper.practice11.vehicle.Engine;

import java.util.Date;

/**
 * Created by citsym on 12.02.17.
 */
public class Car implements Cloneable {
    protected int maxSpeed = 100;
    protected Date manufDate;
    Engine engine = new Engine(2);

    boolean isNewCar = false;


    public Car() {
    }

    public Car( int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

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


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isNewCar() {
        return isNewCar;
    }

    public void setNewCar(boolean newCar) {
        isNewCar = newCar;
    }
}
