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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getMaxSpeed() != car.getMaxSpeed()) return false;
        return getYearOfManufacture() == car.getYearOfManufacture();
    }

    @Override
    public int hashCode() {
        int result = getMaxSpeed();
        result = 31 * result + getYearOfManufacture();
        return result;
    }
}
