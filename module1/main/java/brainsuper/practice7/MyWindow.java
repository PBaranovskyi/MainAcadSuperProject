package brainsuper.practice7;

/**
 * Created by citsym on 04.02.17.
 */
public class MyWindow {

    private double width; //0.0
    private double height; //0.0
    private int numberOfGlass; // 0
    private String color; // null
    private boolean isOpen; // false


    public MyWindow() {

        this.width          = 1600;
        this.height         = 1200;
        this.numberOfGlass  = 19;
        this.color           = "orange";
        this.isOpen         = false;

    }


    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;

    }

    public MyWindow(double width, double height, int numberOfGlass) {

        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;

    }

    public void printFields() {

        System.out.println(
                "MyWindow{" +
                        "width=" + width +
                        ", height=" + height +
                        ", numberOfGlass=" + numberOfGlass +
                        ", color='" + color + '\'' +
                        ", isOpen=" + isOpen +
                        '}'

        );


    }

}
