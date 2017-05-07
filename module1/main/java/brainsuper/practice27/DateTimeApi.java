package brainsuper.practice27;

import java.sql.ResultSetMetaData;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by citsym on 06.05.17.
 */
public class DateTimeApi {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalTime time = LocalTime.now();

        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);


        Date date = new Date();

        System.out.println("date :" + date);

        System.out.println(date.getTime());


        Date dateFromTM = new Date(1494055948990L);

        System.out.println(dateFromTM);

        printTickets(date);


        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, 10);

        System.out.println(c.getTime());


        System.out.println(Instant.now().getEpochSecond());
        Instant in = localDateTime.toInstant(ZoneOffset.ofHours(2));

        Date todayOld = new Date(in.getEpochSecond());

        System.out.println(todayOld);

        ZoneId kiev=ZoneId.of("Europe/Kiev");

        ZonedDateTime kievDateTime=
                ZonedDateTime.of(localDateTime, kiev);


        System.out.println(kievDateTime.toInstant());

        ZoneId berlin=ZoneId.of("Europe/Berlin");

        ZonedDateTime berlinTime=kievDateTime.
                withZoneSameInstant(berlin);

        todayOld = Date.from(berlinTime.toInstant());

        System.out.println(todayOld);

        Duration myTalkDuration = Duration.ofMinutes(45);
        Period period = Period.of(10, 2, 1);

        LocalDate nextFrd = today.with(
                TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println("FRIDAY " + nextFrd);

        Period between = period.between(today, nextFrd);
        berlinTime.plus(between);


        String rus =  DateTimeFormatter
                .ofPattern("MMM d yy  hh:mm a")
                .withLocale(new Locale("ru"))
                .format(localDateTime);

        System.out.println(rus);


        LocalDate birthdayThisYear = LocalDate.of(2017, Month.MAY, 6);


        Period shredingerBirthday = Period.between(today, birthdayThisYear);

        if (shredingerBirthday.isNegative()) {
            System.out.println("Past already");
        } else if (shredingerBirthday.isZero()){
            System.out.println("Birthday today!");
        } else {
            System.out.println("Will be soon");
        }

        ResultSetMetaData
    }

    private static void printTickets(Date date) {

        date.setYear(-116);

        System.out.printf("Tickets to Maroko for %tF", date);
    }
}
