package brainsuper.practice11;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by citsym on 25.02.17.
 */
class Employee {
    String name;
    int age;

    public void Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}

public class Main {

    public static final String KATE = "Kate";
//    public String KATE = KATE1;


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
////        Date date = new Date(-40, 0, 13);
//
//        calendar.set(2017, 1, 12);

        Date newDate = calendar.getTime();

        System.out.println(newDate);
        System.out.println(newDate.getTime());
        System.out.println(new Date(1486892092770L));

        Employee e = new Employee();

        Main sovaMasha = new Main();
        e.Employee(sovaMasha.KATE, 18);
        System.out.println(e.name);
    }
}
