package brainsuper.practice11.vehicle;

/**
 * Created by citsym on 25.02.17.
 */
public class Car extends Vehicle {

    Engine engine = new Engine(2);


    @Override
    public void move() {
        System.out.println("Rrrrrr");
    }
}
