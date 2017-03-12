package brainsuper.practice4;

/**
 * Created by citsym on 28.01.17.
 */
public class UseClasses {


    public static int calcSum(int[] arrayToSum) {

        int sum = 0;
        for (int i : arrayToSum) {


            sum += i;
        }

        return sum;
    }


    public static int calcSumVarargs(int multiplier, int... arrayToSum) {

        int sum = 0;
        for (int i : arrayToSum) {


            sum += i;
        }

        return sum * multiplier;
    }

    public static void main(String... args) {


        Car car1 = new Car(20);


        System.out.println("Max speed : " + car1.getMaxSpeed());

        car1.setMaxSpeed(200);


        System.out.println("Max speed : " + car1.getMaxSpeed());


        Car car2;
        car2 = new Car(30, "blue");

        System.out.println("Max speed car2: " + car2.getMaxSpeed());
        System.out.println("Current speed car2: " + car2.getCurrentSpeed());


        car2.year = 2010;

        System.out.println("Year " + car2.getYear());

        int year = car2.getYear();

        year = 2020;


        System.out.println("Year " + car2.getYear());

        System.out.println("Oil loss: " + car2.calculateOilLoss(150));
        System.out.println("Oil loss with curr speead: " + car2.calculateOilLoss(150, 50));


        Car car3 = new Car(30);

        car3 = null;

        System.out.println("Oil loss with curr speead: " + car3.calculateOilLoss(150, 50));


        Car[] cars = {new Car(20), new Car(30, "blue"), car1, car2, car3};


        int[] ints = {1, 2, 3, 45, 234};

        System.out.println(calcSum(ints));


        System.out.println(calcSumVarargs(34, 23));


        car2.calculateOilLoss(23);


    }
}
