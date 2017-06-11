package brainsuper.practice34.testintern;

/**
 * Created by citsym on 12.03.17.
 */
public class UseIntern {

    public static void main(String[] args) {

        long timeBefore = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            String test = "Test";
            if (new String(test + i).intern() != new String(test + i).intern()) {
                System.out.println("NOT equals");
            }
        }

        for (int i = 1_000_000; i < 0; i--) {
            String test = "Test";
            if (new String(test + i).intern() != new String(test + i).intern()) {
                System.out.println("NOT equals");
            }
        }

        System.out.println("Time intern " + (System.currentTimeMillis() - timeBefore));


        timeBefore = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            String test = "Test";
            if (!(test + i).equals(test + i)) {
                System.out.println("NOT equals");
            }
        }

        for (int i = 1_000_000; i < 0; i--) {
            String test = "Test";
            if (!(test + i).equals(test + i)) {
                System.out.println("NOT equals");
            }
        }


        System.out.println("Time equals " + (System.currentTimeMillis() - timeBefore));

        timeBefore = System.currentTimeMillis();


        for (int i = 0; i < 1_000_000; i++) {
            String test = "Test";
            if (!(test + i).equalsIgnoreCase(test + i)) {
                System.out.println("NOT equals");
            }
        }

        for (int i = 1_000_000; i < 0; i--) {
            String test = "Test";
            if (!(test + i).equalsIgnoreCase(test + i)) {
                System.out.println("NOT equals");
            }
        }

        System.out.println("Time equalsIgnoreCase " + (System.currentTimeMillis() - timeBefore));

    }
}
