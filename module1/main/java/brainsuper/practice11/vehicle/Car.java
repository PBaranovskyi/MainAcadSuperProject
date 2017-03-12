package brainsuper.practice11.vehicle;

/**
 * Created by citsym on 25.02.17.
 */
public class Car extends Vehicle {

    private Engine engine = new Engine(2);

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("Rrrrrr");
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
