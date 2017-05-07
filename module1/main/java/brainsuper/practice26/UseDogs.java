package brainsuper.practice26;


import brainsuper.practice19.Car;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by citsym on 30.04.17.
 */
public class UseDogs {

    public static void main(String[] args) {

        Dog dog = UseDogs::createACar;


        dog.sayWoof();
        Car bmw = dog.wagTail("BMW", 2000);

        System.out.println(bmw.getPrice());

        Random random = new Random();

//        random.ints().forEach(System.out::println);

//        "TEST TEST".chars().forEach(System.out::println);

        Stream.generate(()-> random.nextInt(100)).forEach(System.out::println);
    }


    private static Car createACar(String model, int year){
        Car car = new Car(model, year);
        car.setPrice(100000);
        return car;
    }
}
