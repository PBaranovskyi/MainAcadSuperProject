package brainsuper.practice9.factory.sport.superSrort;

import brainsuper.practice9.factory.Car;

import java.util.Random;

/**
 * Created by citsym on 11.02.17.
 */
public class SportCar12 extends Car {

    int maxSpeed = 200;

//    public int whealsCount = 6;

    {
        System.out.println("Sport car block");
    }

    public SportCar12() {
        super(6);
        System.out.println("End of Sport car constructor");
    }

    public void driveForFun(){
        System.out.println("What a fun");
        drive(new Random().nextInt(100));

        System.out.println("we have "+ whealsCount);
    }

    @Override
    public void drive(int distance) {
        System.out.println("UHU! We are so cool!");
        super.drive(distance);
//        System.out.println("UHU! We are so cool!");
    }


    @Override
    public void clean() {
        System.out.println("Clean me very sportly");
    }
}
