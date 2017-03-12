package brainsuper.practice2.ifstatment;

/**
 * Created by citsym on 21.01.17.
 */
public class UseLoops {

    public static void main(String[] args) {
//        int i = 0;

//
//        while (i < 10) {
//            System.out.println("Iterration " + i);
//            i++;
//        }
//

//        do {
//            System.out.println("Iterration " + i);
//            i++;
//        } while (true);


        for (int j = 20, i = 0; i <= j; i = i + 3, j++) {

            if (j == 28){
                System.exit(1);
//                i = j/0;
                System.out.println("continue skipping itteration");
                continue;
            }

            String name = "Vasya";

            System.out.println(name + " knows " + "J =" + j + " i = " + i);



        }





    }
}
