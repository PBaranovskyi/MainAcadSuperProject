package brainsuper.practice7;

/**
 * Created by citsym on 04.02.17.
 */
public class Phone {

    boolean tested;
//    static int i; // 0

    public void setTested(boolean val) {

        tested = val;

    }

    public boolean isTested() {

        return tested;

    }

    public static void main(String[] args) {                  //  line2

        int i;                                                            //  line3

        boolean b = true;                                          //  line4

        if (b) {                                                        //  line5
            i = 1;                                                  //  line6
        } else {
            i = 0;
        }


        System.out.println(i);                                   //  line8

    }

}
