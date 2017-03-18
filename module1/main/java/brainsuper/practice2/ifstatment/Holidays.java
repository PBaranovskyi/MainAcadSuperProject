package brainsuper.practice2.ifstatment;


import java.util.ArrayList;

/**
 * Created by citsym on 21.01.17.
 */
public class Holidays {

    public static final String NUMBER_OF_HOLIDAYS_IN_JANUARY = "5";

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList() {
            @Override
            public int size() {
                return super.size() * 2;
            }
        };


        arrayList.add("Some");
        arrayList.add("Some");

        System.out.println(arrayList.size());

        try {
            System.out.println(getNumberOfHolidays(MonthEnum.valueOf("ЧЕРНАЯ")));
        } catch (RuntimeException e){
            e.printStackTrace();
        }


//        String month = МАРТ;
//
//        for (int i = 0; i < 10; i++) {
//
//            switch (month) {
//
//                case ЯНВАРЬ:
//                    System.out.println("1 - Новый год");
//                    System.out.println(NUMBER_OF_HOLIDAYS_IN_JANUARY + " - днюха");
//                    System.out.println("7 - Рождество!!!");
//                    System.out.println("13 - Старый новый Год!!!");
//                    System.out.println("14 - Василя");
//                    break;
//                case ФЕВРАЛЬ:
//                    System.out.println("14 - Валентина день");
//                    break;
//                case АПРЕЛЬ:
//                    System.out.println("1 - день смеха");
//                    break;
//                case МАРТ:
//                case МАЙ:
//                case ИЮНЬ:
//                    continue;
//                case ИЮЛЬ:
//                case АВГУСТ:
//                case ОКТЯБРЬ:
//                case СЕНТЯБРЬ:
//                case НОЯБРЬ:
//                case ДЕКАБРЬ:
//                    System.out.println("Не припомню праздников");
//                    break;
//                default:
//                    System.out.println("Не правильный месяц");
//
//            }
//        }


    }

    public static int getNumberOfHolidays(MonthEnum month){

        System.out.println("Order " +month.ordinal());
        for (MonthEnum monthEnum : MonthEnum.values()) {
            System.out.println("In month " + monthEnum.getMonthName() + " " + monthEnum.getNumberOfHolidays() + " holidays");
        }

        System.out.println("In month " + month.getMonthName() + " " + month.getNumberOfHolidays() + " holidays");

        return month.getNumberOfHolidays();
    }
}
