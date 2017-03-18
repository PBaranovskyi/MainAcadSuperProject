package brainsuper.practice2.ifstatment;

/**
 * Created by citsym on 18.03.17.
 */
public enum MonthEnum {

    АВГУСТ ( "Август"),
    ОКТЯБРЬ ( "Октябрь"),
    ЯНВАРЬ ( "Январь", 5),
    ФЕВРАЛЬ ( "Февраль", 2),
    АПРЕЛЬ ( "Апрель", 1),
    МАРТ ( "Март"),
    МАЙ ( "Май"),
    ИЮНЬ ( "Июнь"),
    ИЮЛЬ ( "Июль"),
    СЕНТЯБРЬ ( "Сентябрь"),
    НОЯБРЬ ( "Ноябрь"),
    ДЕКАБРЬ ( "Декабрь");

    private final String monthName;
    private final int numberOfHolidays;

    MonthEnum(String month) {
        this.monthName = month;
        numberOfHolidays = 0;
    }


    MonthEnum(String month, int number) {
        this.monthName = month;
        numberOfHolidays = number;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfHolidays() {
        return numberOfHolidays;
    }

    public static MonthEnum  valueOFLower(String lower){

        return valueOf(lower.toUpperCase());
    }
}
