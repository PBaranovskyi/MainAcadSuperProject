package brainsuper.practice19;

import java.io.Serializable;

public class Car implements Comparable<Car>, Serializable {
   private int year;
   private String model;
   private int price;
   private String nameOfTheOwner;
   private String color;
   private int doorsCount;
   private int wheelsCount;
   private String type;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public Car(String model, int year, int price, String nameOfTheOwner) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.nameOfTheOwner = nameOfTheOwner;
    }

    public Car(CarBuilder carBuilder){
        this.year=carBuilder.year;
        this.model=carBuilder.model;
        this.price=carBuilder.price;
//        this.doorsCount=carBuilder.doorsCount;
//        this.wheelsCount=carBuilder.wheelsCount;
//        this.color=carBuilder.color;
//        this.type=carBuilder.type;
        this.nameOfTheOwner=carBuilder.nameOfTheOwner;

    }

    
    //перегрузка метода
    int test(int a, String name) {
        return a - 5;
    }

    int test(int a, int b) {
        return a - 5;
    }

    void printOwnerName() {
        System.out.println(nameOfTheOwner);
    }

    void printYear() {
        System.out.println(this.year);
    }


    public static void main(String[] args) {


    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getYear() != car.getYear()) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        return !(nameOfTheOwner != null ? !nameOfTheOwner.equals(car.nameOfTheOwner) : car.nameOfTheOwner != null);

    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + (nameOfTheOwner != null ? nameOfTheOwner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", nameOfTheOwner='" + nameOfTheOwner + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


    @Override
    public int compareTo(Car o) {

        Integer thisCarYear = this.year;

        return thisCarYear.compareTo(o.getYear());
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
