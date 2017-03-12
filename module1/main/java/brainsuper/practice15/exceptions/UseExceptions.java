package brainsuper.practice15.exceptions;


import brainsuper.practice11.vehicle.Car;
import brainsuper.practice11.vehicle.Engine;
import brainsuper.practice15.exceptions.overrideexceptions.Demo;
import brainsuper.practice15.exceptions.overrideexceptions.Test;

import java.io.IOException;

/**
 * Created by citsym on 11.03.17.
 */
public class UseExceptions {


    public static void main(String[] args) {

        Test test = new Demo();

        someJobe(test);


        System.out.println("Start");
        Car someCar = new Car();
        System.out.println(getTestValue(someCar));
        System.out.println("end");


        System.out.println(someCar);

        Test test2 = null;
        someJobe(test2);

    }

    private static void someJobe(Test test) {
        assert test != null : "test obj s hould not be null never";

        try {
            test.doJob();
        } catch (IOException e){
            System.out.println("IO handled!!!!!!!!!!!!!");
        }
    }

    public static Car getTestValue(Car x) {
        x = new Car(new Engine(5));
        int y = 50;
        Car car = new Car();

        try {
            Integer integer = Integer.valueOf("dfdfd");
        } catch (NumberFormatException e) {
            System.out.println("Wrong format");
        }

        try {
            try {
                someStrangeCode();

            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Catch");
                return car;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index of bounds ");
            } catch (RuntimeException e) {
                System.out.println("Runtime");
            } catch (Exception e ){
                System.out.println("Excetion");
            } catch (Throwable e){
                System.out.println("Errors " + e.getMessage());
            } finally {
                System.out.println("Finally");
                car.setEngine(new Engine(3));
                y = 100;
                return car;
            }
        } finally {
            car.setEngine(new Engine(10));
            return car;
        }




//        return null;
    }

    private static void someStrangeCode() {

    }
}
