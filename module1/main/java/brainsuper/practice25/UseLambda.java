package brainsuper.practice25;

import brainsuper.practice12.worldWithoutPolymorfizm.sort.Car;

import java.util.Arrays;

/**
 * Created by citsym on 29.04.17.
 */
public class UseLambda {

    public static void main(String[] args) {

        Integer[] array = {345, 234, 6, 67, 23 ,55 , 23};


        Car car = new Car(40 , 2000);

        car.setMaxSpeed(200);

// What to do if button pressed
//        Comparator<Integer> integerComparator = (o1, o2) -> o2 - o1 - car.getMaxSpeed();

        Arrays.sort(array, (o1, o2) -> o2 - o1 - car.getMaxSpeed());

//        Arrays.sort(array, 5 , 10);


        System.out.println(Arrays.toString(array));

    }
}
