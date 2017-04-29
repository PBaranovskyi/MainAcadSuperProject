package brainsuper.practice25;

import brainsuper.practice19.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by citsym on 29.04.17.
 */
public class UseCars {

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 2000, 1000));
        list.add(new Car("BMW", 1989, 2000));
        list.add(new Car("OPEL", 2010, 4000));
        list.add(new Car("Toyota", 2005, 1300));
        list.add(new Car("Nissan", 2011, 5000));
        list.add(new Car("Toyota", 2015, 4300));

        List<String> models = list.stream()
                .map((c) -> {
                    System.out.println(c);
                    return c.getModel().toLowerCase();
                })
                .filter((model) -> !model.equals("nissan"))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(models);

        Predicate<Car> carFilter = c -> {
            if (c.getPrice() > 4000) {
                return true;
            }
            return (c.getModel().equals("BMW")) && (c.getYear() <= 2000);
        };

        list = list.stream()
                .filter(carFilter)
                .filter(car -> car.getModel().equals("Nissan"))
                .limit(5)
                .collect(Collectors.toList());

//        list = filterHappensHere(list, carFilter);

        for (Car car : list) {
            System.out.println(car);
        }


    }

//    private static List<Car> filterHappensHere(List<Car> list, CarFilter filterClass) {
//        List<Car> filteredList = new ArrayList<>();
//        for (Car car : list) {
//            if (filterClass.filter(car)) {
//                filteredList.add(car);
//            }
//        }
//
//        return filteredList;
//    }

//    private static <T, R> List<R> transform(List<T> list, Function<T, R> function) {
//        List<R> result = new ArrayList<>();
//        for (T income : list) {
//            result.add(function.apply(income));
//        }
//        return result;
//    }

}
