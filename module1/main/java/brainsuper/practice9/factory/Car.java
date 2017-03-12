package brainsuper.practice9.factory;

import java.util.Arrays;

/**
 * Created by citsym on 05.02.17.
 */
public class Car {

    public int whealsCount = 4;

    Wheal[] arrayWheals;

    {
        System.out.println("Car init block");
    }

    public Car() {
        initWheals();
    }

    public Car(int whealsCount) {
        this.whealsCount = whealsCount;
        System.out.println("Car constructor");
        initWheals();
    }

    protected void drive(int distance){

        System.out.println("UHU! We drive the distance of " + distance );
    }


    public void clean(){
        System.out.println("Clean " + getClass().getSimpleName() );
    }

    private void initWheals(){
        arrayWheals  = new Wheal[whealsCount];

        for (int i = 0; i < arrayWheals.length; i++) {
            arrayWheals[i] = new Wheal();
        }
    }

    public int getAcualWhealsCount() {
        return arrayWheals.length;
    }

    public Wheal[] getWheals(){
       return Arrays.copyOf(arrayWheals, arrayWheals.length);
    }
}
