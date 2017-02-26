package brainsuper.practice11.vehicle;

/**
 * Created by citsym on 25.02.17.
 */
public class UseVehicle {

    public static void main(String[] args) {


        Car myCar = new Car();
        moveVehicle(myCar);

        Truck ankleTruk = new Truck();
        moveVehicle(ankleTruk);


        Deltaplan brothersDeltaplan = new Deltaplan();
        moveVehicle(brothersDeltaplan);


    }





    private static void moveVehicle(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getCanonicalName()+":" );
        vehicle.move();
    }


}
