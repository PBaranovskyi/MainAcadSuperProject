package brainsuper.practice24;

import brainsuper.practice19.Car;

import java.io.*;

/**
 * Created by citsym on 23.04.17.
 */
public class UseSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car myCar = new Car("Nissan", 2012);
        Car myCar2 = new Car("BMW", 2016);

        FileOutputStream out = new FileOutputStream("car.ser");
        ObjectOutputStream objOut = new ObjectOutputStream(out);
        objOut.writeObject(myCar);
        objOut.writeObject(myCar2);

        
        //=====================

        FileInputStream input = new FileInputStream("car.ser");
        ObjectInputStream objInput = new ObjectInputStream(input);

        Car copyCar = (Car)objInput.readObject();
        Car copyCar2 = (Car)objInput.readObject();
//        Car copyCar3 = (Car)objInput.readObject();


        System.out.println(copyCar.getModel());
        System.out.println(copyCar.getYear());

        System.out.println(copyCar2.getModel());
        System.out.println(copyCar2.getYear());


//        System.out.println(copyCar3.getModel());
//        System.out.println(copyCar3.getYear());

        objInput.close();

        FileInputStream input2 = new FileInputStream("car.ser");
        ObjectInputStream objInput2 = new ObjectInputStream(input2);

        Car copyCopyCar = (Car)objInput2.readObject();


        System.out.println(copyCopyCar.getModel());
        System.out.println(copyCopyCar.getYear());

    }
}
