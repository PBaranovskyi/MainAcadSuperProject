package brainsuper.practice12.worldWithoutPolymorfizm;

import java.util.Arrays;

/**
 * Created by citsym on 26.02.17.
 */
public class FeedSomeObjects {


    private int someXLiters = 10;

    private CanBeFunWith cat = new CanBeFunWith() {
        @Override
        public void drinkABeer() {
            System.out.println("Cat drinks el " + someXLiters);
        }

        @Override
        public void tellAJoke() {
            System.out.println("May may joke");
        }
    };

    public static void main(String[] args) {

        Robot robot = new Robot();

        Princess phiona = new Princess();

        PeopleEater shrek = new PeopleEater();

        Donkey donkey = new Donkey();

        Donkey donkey2 = new Donkey();


        restorant(robot, phiona, shrek, donkey);

        Object[] visitors = new Object[5];

        visitors[0] = robot;
        visitors[1] = phiona;
        visitors[2] = shrek;
        visitors[3] = donkey;
        visitors[4] = donkey2;


        restorant(visitors);

        System.out.println("===================");
        final Eater[] eaters = new Eater[6];

        eaters[0] = robot;
        eaters[1] = phiona;
        eaters[2] = shrek;
        eaters[3] = donkey;
        eaters[4] = donkey2;

        restorant(eaters);

        CanBeFunWith cat = new CanBeFunWith() {

            @Override
            public void drinkABeer() {
                System.out.println("Cat drinks el " + Arrays.toString(eaters));
            }

            @Override
            public void tellAJoke() {
                System.out.println("May may joke");
            }
        };

        fun(cat);


    }

    private static CanBeFunWith fun(CanBeFunWith someObj) {

        someObj.drinkABeer();
        someObj.tellAJoke();

        return someObj;

    }


    private static void restorant(Eater[] eaters) {
        for (Eater eater : eaters) {
            eater.feed();

            if (eater instanceof CanBeFunWith) {
                fun((CanBeFunWith) eater);
            }
        }

    }


    private static void restorant(Object[] visitors) {
        for (Object visitor : visitors) {

            if (visitor instanceof Donkey) {
                ((Donkey) visitor).feed();
            }

            if (visitor instanceof Princess) {
                ((Princess) visitor).naymNyam();
            }

            if (visitor instanceof PeopleEater) {
                ((PeopleEater) visitor).feed();
            }

            if (visitor instanceof Robot) {
                ((Robot) visitor).feed();
            }

        }

    }

    private static void restorant(Robot robot, Princess phiona, PeopleEater shrek, Donkey donkey) {
        robot.feed();
        phiona.naymNyam();
        shrek.feed();
        donkey.feed();
    }
}
