package brainsuper.practice19;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by citsym on 25.03.17.
 */
public class UseCollections {

    public static void main(String[] args) {


        List<Car> cars = (List) fillWithCars(new ArrayList<>());

        System.out.println(cars);

        Car[] myArrStr = cars.toArray(new Car[0]);

        System.out.println(Arrays.toString(myArrStr));


//        int indexOfNissan = cars.indexOf(new Car("Nissan", 2000, 200000, "Vasya"));

//        System.out.println("Previous " +cars.get(indexOfNissan - 1));

//        Car carToRemove = null;

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car element = iterator.next();
            if (element.getModel().equals("BMW") && element.getYear() == 1987) {
                iterator.remove();
            }
        }

//        cars.remove(carToRemove);

//        cars.remove(new Car("BMW", 1987, 200000, "Pavlo"));

        System.out.println(cars);

        Collections.addAll(cars, new CarBuilder().setModel("Lada").setYear(2010).setPrice(20000).setNameOfTheOwner("Kolya").createCar(), new CarBuilder().setModel("Renault").setYear(2011).setPrice(230000).setNameOfTheOwner("Nastya").createCar());

        System.out.println(cars);

        List<Car> superCars = (List) fillWithCars(new ArrayList<>());

        List<Car> collect = superCars.stream().filter((c) -> c.getModel().equals("Nissan")).collect(Collectors.toList());

        for (Car superCar : collect) {
            System.out.println(superCar);
        }


//        Collections.addAll(superCars, new SuperCar("Lada", 2010, 20000, "Kolya"), new SuperCar("Renault", 2011, 230000, "Nastya"));
//
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list, "bb", "a", "ff ", "cc", "b", "d");
//
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        Collections.shuffle(list);
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        List<String> strings = Collections.unmodifiableList(list);
//
//        strings.add("test");
//
//        System.out.println(strings);
    int a =1;

//        System.out.println(!a);
    }

    public static Collection<Car> fillWithCars(Collection<Car> cars) {
        cars.add(new CarBuilder()
                .setModel("Nissan")
                .setYear(2000)
                .setPrice(200000)
                .setNameOfTheOwner("Vasya")
                .createCar());
        cars.add(new CarBuilder().setModel("BMW").setYear(1987).setPrice(200000).setNameOfTheOwner("Pavlo").createCar());
        cars.add(new CarBuilder().setModel("BMW").setYear(1987).setPrice(200000).setNameOfTheOwner("Pavlo").createCar());
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
//        cars.add(new Car("Nissan", 2000, 200000, "Vasya"));
        return cars;
    }
}