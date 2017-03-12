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


        Date date = new Date(-40, 0, 13);

        System.out.println("Old date " + date);
        Date newMonthDate = addMonthToADate(date);

        System.out.println("Add mont " + newMonthDate);
        System.out.println("Old mont " + date);

        System.out.println("===============");

        System.out.println("Old2 date " + date);
        Date newMonthDate2 = addMonthToADate2(date);

        System.out.println("Add2 mont " + newMonthDate2);
        System.out.println("Add2 mont " + date);

    }

    private static Date addMonthToADate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 1);
        return calendar.getTime();
    }

    private static Date addMonthToADate2(Date date) {
//        int dateNumber = date.getDate();
        int month = date.getMonth() + 1;
        if (month > 11) {
            date.setMonth(0);
        } else {
            date.setMonth(month);
        }
        return date;
    }
}
