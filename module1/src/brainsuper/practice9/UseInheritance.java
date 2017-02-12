package brainsuper.practice9;

import brainsuper.practice9.factory.Car;
import brainsuper.practice9.factory.SuperCar;
import brainsuper.practice9.factory.Wheal;
import brainsuper.practice9.factory.sport.superSrort.SportCar12;

/**
 * Created by citsym on 11.02.17.
 */
public class UseInheritance {

    public static void main(String[] args) {

//        SportCar12 sportCar = new SportCar12();
//
//        sportCar.driveForFun();
//
//        System.out.println(sportCar.whealsCount);
//
//        System.out.println("===============");
//
//        SuperCar superCar = new SuperCar();
//
//        superCar.drive(500);
//
//        System.out.println("===============");
////
//        cleanCar(sportCar);
////        cleanCar(superCar);
////
//        Car car = new Car();
//
//        cleanCar(car);
//
        Car superCar = new SuperCar();
//
//        cleanCar(carSuper);
//
//
//        checkWheals(car);
//        System.out.println("...........");
//        checkWheals(sportCar);
//        System.out.println("...........");
//        checkWheals(superCar);


        Car car = new Car();

        System.out.println("========");
        SportCar12 sportCar = new SportCar12();



        checkWheals(car);
        System.out.println("...........");
        checkWheals(sportCar);
        System.out.println("...........");
        checkWheals(superCar);

    }

    static void cleanCar(Car car) {
        car.clean();
        if (car instanceof SportCar12) {
            SportCar12 carSuper = (SportCar12) car;
            carSuper.driveForFun();
        }

    }


    static void checkWheals(Car car){
        System.out.println("Nuber of wheals " + car.getAcualWhealsCount());
        for (Wheal wheal : car.getWheals()) {
            if (!wheal.check()){
                System.out.println("You are in danger");
                return;
            }
        }
    }

}
