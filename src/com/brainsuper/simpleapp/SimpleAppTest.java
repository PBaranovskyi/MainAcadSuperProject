package com.brainsuper.simpleapp;

/**
 * Created by citsym on 14.01.17.
 */
public class SimpleAppTest {

    public static final String HELLO_WORLD = "Hello world";

    public static void main(String[] args) {


        int number = 11; // 0000_0000 0000_0000 0000_0000 0000_1011

        long longNumber = 3_000_000_000L;

        byte operand1 = 5;
        byte operand2 = 125;

        byte sum = (byte) (operand1 + operand2);


        long longNumber1 = 3_000_000_000L;
        long longNumber2 = 3_000_000_000L;


        long sumLong = longNumber1 + longNumber2;

        System.out.println("SumLong = " +sumLong);

        System.out.println("Sum = " + sum);

        float someFloat = 1100.000000000000000000017F;
        float someFloatInt = 11;

        double someDouble = 11.7;



        char charSymbolInt = 20_000;
        char charSymbol1 = '両';


        if (charSymbol1 > charSymbolInt) {
            System.out.println("Bigger");
        }

        System.out.println("charSymbolIntValue = " +charSymbolInt);
        System.out.println(Integer.valueOf(charSymbol1));

        doublePrintHello();


    }

    private static void doublePrintHello() {
        System.out.println(HELLO_WORLD);

        System.out.println(HELLO_WORLD);
    }
}
