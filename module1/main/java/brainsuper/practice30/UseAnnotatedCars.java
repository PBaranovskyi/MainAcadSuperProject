package brainsuper.practice30;

import brainsuper.practice19.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 21.05.17.
 */
public class UseAnnotatedCars {



    @Max(3)
    static List<Car> list = new ArrayList<>();



    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        MaxProcessing.sutUpAnnotations(UseAnnotatedCars.class);

        list.add(new Car("BMW", 2000, 1000, "VASYA", "KOLAYA"));
        list.add(new Car("BMW", 1989, 2000, "MARINA", "OLYA"));
        list.add(new Car("OPEL", 2010, 4000, "MISHA", "OLYA"));
        list.add(new Car("Toyota", 2005, 1300, "MISHA", "OLYA"));
        list.add(new Car("Nissan", 2011, 5000, "MASHA", "NASTYA", "PETYA"));
        list.add(new Car("Toyota", 2015, 4300, "MISHA", "OLYA"));

        for (Car car : list) {
            System.out.println(car);
        }

    }

}
