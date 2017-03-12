package brainsuper.practice10.clone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by citsym on 12.02.17.
 */
public class CarClone {

    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = sdf.parse("12/09/2089");
        Car myCar1 = new Car(dt, 180);
        System.out.println(myCar1);

        Car myCar2 = (Car) myCar1.clone();
        System.out.println(myCar2);


    }
}
