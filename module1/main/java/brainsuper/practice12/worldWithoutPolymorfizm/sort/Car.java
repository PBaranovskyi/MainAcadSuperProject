package brainsuper.practice12.worldWithoutPolymorfizm.sort;

/**
 * Created by citsym on 26.02.17.
 */
public class Car implements Comparable<Car> {
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(int maxSpeed, int yearOfManufacture) {
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public int compareTo(Car toCompare) {
        if (this.maxSpeed > toCompare.getMaxSpeed() ) return -1;
        if (this.maxSpeed < toCompare.getMaxSpeed() ) return 1;

        if (this.maxSpeed == toCompare.getMaxSpeed()){
           if (this.yearOfManufacture > toCompare.yearOfManufacture) return -1;
           if (this.yearOfManufacture < toCompare.yearOfManufacture) return 1;
        }
        return 0;
    }
}
