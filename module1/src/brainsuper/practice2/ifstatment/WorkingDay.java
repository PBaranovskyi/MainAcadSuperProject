package brainsuper.practice2.ifstatment;

/**
 * Created by citsym on 21.01.17.
 */
public class WorkingDay {

    public static void main(String[] args) {

        boolean male = true;

        final int timeOfAwakens = 6;

        int currentTime = timeOfAwakens;


        if (currentTime < 9) {
            System.out.println("Go to market. Time:  " + currentTime);
            currentTime++;
        }

        if (currentTime < 10) {
            if (male) {
                System.out.println("Go to gym. Time:  " + currentTime);
            } else {
                System.out.println("Go to kindergarten. Time:  " + currentTime);
            }
            currentTime++;
        }


//        if (currentTime < 10 && male) {
//            System.out.println("Go to gym. Time:  " + currentTime);
//            currentTime++;
//        } else if (currentTime < 10 && !male) {
//            System.out.println("Go to kindergarten. Time:  " + currentTime);
//            currentTime++;
//        }


        System.out.println("Go to work. Time: " + currentTime);

    }
}
