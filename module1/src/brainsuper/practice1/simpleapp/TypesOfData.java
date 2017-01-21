package brainsuper.practice1.simpleapp;

/**
 * Created by citsym on 15.01.17.
 */
public class TypesOfData {

    public static final String ALIAS_VALUE = "alias value";

    public static void main(String[] args) {

        byte b = 4; // 0000 0100

        byte b_binary = 0b00000100;

        b_binary <<= b_binary;

        System.out.println(b_binary);

        int int_binary = 0b00001000;

        System.out.println(int_binary);

        int_binary <<= int_binary;

        System.out.println(int_binary);

//        short
//        int
//        long
//        float
//        double
//        char
//        boolean
//
//        Object
//


        double d_value = 12.8;

        int testInt = (int) d_value;

        System.out.println(testInt);


        String nameOfSomething = ALIAS_VALUE;


        int i_value = 5;

        double testDouble = i_value;

        System.out.println(testDouble);

        System.out.println(testDouble == i_value);


        boolean someCondition = getFirstCondition() && getSecondCondition() && getTherdCondition();

        if (someCondition){
            System.out.println("We are here");
        } else  {
            System.out.println("We are there");
        }


        System.out.println(someCondition ? "We are here" : "We are there");

//==============================

        long longValue = 1234234234434534535L;
        float fValue;

        fValue = longValue;

    }

    private static boolean getFirstCondition() {
        return true;
    }

    private static boolean getSecondCondition() {
        return false;
    }
    private static boolean getTherdCondition() {
        return false;
    }
}
