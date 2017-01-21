package brainsuper.practice2.ifstatment;

/**
 * Created by citsym on 21.01.17.
 */
public class SwitchStatement {

    public static void main(String[] args) {
        int month = 5;

        if (month == 1) {
            System.out.println("Январь");
        } else if (month == 2) {
            System.out.println("Февраль");
        } else if (month == 3) {
            System.out.println("Март");
        } else if (month == 4) {
            System.out.println("Апрель");
        } else if (month <= 12) {
            System.out.println("Какой - то другой месяц");
        } else {
            System.out.println("Некорректный ввод");
        }


        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Январь");
                break;
            case 3:
                System.out.println("Январь");
                break;
            case 4:
                System.out.println("Январь");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Январь");
                break;
            case 7:
                System.out.println("Январь");
                break;
            case 8:
                System.out.println("Январь");
                break;
            case 9:
                System.out.println("Январь");
                break;
            case 11:
                System.out.println("Январь");
                System.out.println("Январь");
                System.out.println("Январь");
                break;
            case 12:
                System.out.println("Январь");
                break;
            default:
                System.out.println("Некорректный ввод");
        }





    }
}
