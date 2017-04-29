package brainsuper.practice19;

public class CarBuilder {
    String model;
    int year;
    int price;
    String nameOfTheOwner;

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public CarBuilder setNameOfTheOwner(String nameOfTheOwner) {
        this.nameOfTheOwner = nameOfTheOwner;
        return this;
    }

    public Car createCar() {


        if (price == 0) {
            throw new RuntimeException("Please enter price");
        }

        return new Car(this);
    }
}