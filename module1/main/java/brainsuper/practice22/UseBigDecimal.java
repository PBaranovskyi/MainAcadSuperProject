package brainsuper.practice22;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by citsym on 09.04.17.
 */
public class UseBigDecimal {

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("234234.3243");
        BigDecimal bd2 = new BigDecimal("32.3");

        BigDecimal divide = bd.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);


        System.out.println(divide.doubleValue());

        Random rnd = new Random(1);

        System.out.println(rnd.nextInt(100));
    }
}
