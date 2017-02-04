package brainsuper.practice4;

/**
 * Created by citsym on 28.01.17.
 */
public class Car {

    private int maxSpeed = 100;
    private int currentSpeed = 0;
    public int year = 1997;
    private String color;
    private int oilSpend = 10;


    public Car(int currentSpeed){
        this(currentSpeed, "red");
        this.currentSpeed = currentSpeed;
    }

    public Car(int currentSpeed, String color){
        this.currentSpeed = currentSpeed;
        this.color = color;
    }

    public double  calculateOilLoss(int distance){
        return (double) distance * oilSpend / 100;
    }

    public double  calculateOilLoss(int distance, int currentSpeed){
        return calculateOilLoss(distance) * currentSpeed/100;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        System.out.println("MAX Speed changed " + maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
