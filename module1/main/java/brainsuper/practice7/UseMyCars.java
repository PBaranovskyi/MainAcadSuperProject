package brainsuper.practice7;

import brainsuper.practice4.Car;

import java.util.Arrays;

/**
 * Created by citsym on 04.02.17.
 */
public class UseMyCars {



    public static void main(String[] args) {
        Car familyCar = new Car(50);

        crash(familyCar);

        changeMaxSpeed(familyCar.getMaxSpeed());

        changePassenger(familyCar.getPassengers());

        changeDriver(familyCar.getDriver());

        System.out.println(familyCar.getCondition());

        Car myCar = familyCar;

        fix(myCar);


        System.out.println("Driver :" + myCar.getDriver());
        System.out.println("MAx Speed " + myCar.getMaxSpeed());
        System.out.println("Passangers" + Arrays.toString(myCar.getPassengers()));
        System.out.println("My car " + myCar.getCondition());
        System.out.println("Family car " + familyCar.getCondition());


        String test = "Main";

        test = "Changed";

        char c = test.charAt(3);
        c = 69;


        String changedTest = test.substring(0, 4);



        convertObject(0.6D);




    }

    private static void convertObject(Object o) {
        System.out.println("Process " + o.getClass().getSimpleName());
    }

    private static void changeDriver(String driver) {
        driver = "Ira";
    }

    private static void changePassenger(String[] passengers) {
        passengers[1] = "Nastya";
    }

    private static void changeMaxSpeed(Integer maxSpeed) {
        maxSpeed =50;
    }

    private static void fix(Car myCar) {
        myCar.setCondition("A");
    }

    private static void crash(Car familyCar) {
        familyCar.setCondition("C");
    }



}
