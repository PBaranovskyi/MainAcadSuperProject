package brainsuper.practice12.worldWithoutPolymorfizm.sort;

import java.util.Arrays;

import static brainsuper.practice12.worldWithoutPolymorfizm.ArraysUtils.addElementToArray;

/**
 * Created by citsym on 26.02.17.
 */
public class UseSort {

    public static void main(String[] args) {

        Car[] cars = new Car[0];

        cars = addElementToArray(cars, new Car(120, 1987));
        cars = addElementToArray(cars, new Car(200, 2000));
        cars = addElementToArray(cars, new Car(50, 2010));
        cars = addElementToArray(cars, new Car(80, 1950));
        cars = addElementToArray(cars, new Car(150, 2010));
        cars = addElementToArray(cars, new Car(50, 2003));


        for (Car car : cars) {
            System.out.println(car);
        }


        Integer[] intArrays = {67, 32, 25, 62, 345, 013};

        Arrays.sort(intArrays);


        System.out.println(Arrays.toString(intArrays));

        String[] stringArray = {"Petya", "Kolya", "Nastya"};

        Arrays.sort(stringArray);

        System.out.println(Arrays.toString(stringArray));


        sortByMaxSpeed(cars);


        sorByYearsOfManufactured(cars);

    }

    private static void sorByYearsOfManufactured(Car[] cars) {


    }

    private static void sortByMaxSpeed(Car[] cars) {
        Arrays.sort(cars);


        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
