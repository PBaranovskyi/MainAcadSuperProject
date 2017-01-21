package brainsuper.practice2.ifstatment;

/**
 * Created by citsym on 21.01.17.
 */
public class Holidays {

    public static void main(String[] args) {

        String month = "Март";

        switch (month) {

            case "Январь":
                System.out.println("1 - Новый год");
                System.out.println("5 - днюха");
                System.out.println("7 - Рождество!!!");
                System.out.println("13 - Старый новый Год!!!");
                System.out.println("14 - Василя");
                break;
            case "Февраль":
                System.out.println("14 - Валентина день");
                break;
            case "Апрель":
                System.out.println("1 - день смеха");
                break;
            case "Март":
            case "Май":
            case "Июнь":
            case "Июль":
            case "Август":
            case "Октябрь":
            case "Сентябрь":
            case "Ноябрь":
            case "Декабрь":
                System.out.println("Не припомню праздников");
                break;
            default:
                System.out.println("Не правильный месяц");

        }


    }
}
