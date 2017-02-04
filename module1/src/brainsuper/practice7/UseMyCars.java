package brainsuper.practice7;

import brainsuper.practice4.Car;

/**
 * Created by citsym on 04.02.17.
 */
public class UseMyCars {



    public static void main(String[] args) {
        Car familyCar = new Car(50);

        crash(familyCar);


        System.out.println(familyCar.getCondition());


        Car myCar = familyCar;

        fix(myCar);


        System.out.println("My car " + myCar.getCondition());
        System.out.println("Family car " + familyCar.getCondition());

    }

    private static void fix(Car myCar) {
        myCar.setCondition("A");
    }

    private static void crash(Car familyCar) {
        familyCar.setCondition("C");
    }
}
