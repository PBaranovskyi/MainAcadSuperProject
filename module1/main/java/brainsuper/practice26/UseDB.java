package brainsuper.practice26;

import brainsuper.practice19.Car;

import java.util.Optional;

/**
 * Created by citsym on 30.04.17.
 */
public class UseDB {

    public static void main(String[] args) {

//        Car optionalCar = getCarFromDB(67);
//
//        if (optionalCar!=null) {
//            optionalCar.setPrice(1000);
//
//            saveToDB(optionalCar);
//        }


        Optional<Car> optionalCar = getCarFromDB(67);

        if (optionalCar.isPresent()) {
            optionalCar.get().setPrice(1000);

            saveToDB(optionalCar.get());
        }

    }

    private static void saveToDB(Car car) {

    }

    private static Optional<Car> getCarFromDB(int i) {
        return Optional.empty();
    }
}
