package brainsuper.practice1.homework;

/**
 * Created by citsym on 21.01.17.
 */
public class Lab4 {

    static int myIntA = -30_000;

    public static void main(String[] args) {

//        int myIntA = -30_000; // 1111_1111_1111_1111_1000_1010_1100_1111
        int myIntB = -30_000; //
        System.out.println("Initial values: A = " + myIntA + ", B = " + myIntB + "\n");

        myIntA = myIntA << 2; // 1111_1111_1111_1110_0010_1011_0100_0000
        System.out.println("Left shift operator by 2 for A. Now = A " + myIntA);
        myIntA = myIntA >> 4; //1111_1111_1111_1111_1100_0101_0110_1000
        System.out.println("Right shift operator by 4 for A. Now = A " + myIntA);
        myIntA = myIntA >>> 11; // 0000_0000_0001_1111_1111_1111_1111_1000
        System.out.println("Unsigned Right shift operator by 11 for A. Now = A " + myIntA + "\n");

        myIntB = myIntB / 4;
        System.out.println("B divided by 4. Now B = " + myIntB);


    }

}
