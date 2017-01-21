package brainsuper.practice1.house;

/**
 * Created by citsym on 15.01.17.
 */
public class UseHouse {

    public static void main(String[] args) {

        CottageHouse h = new CottageHouse();

        Bunhalo b = new Bunhalo();

        houseKeeping(h);
        houseKeeping(b);
    }

    private static void houseKeeping(Object someThing) {

        if (someThing instanceof CottageHouse) {
            ((CottageHouse) someThing).cleanCottege();
        }

        if (someThing instanceof Bunhalo) {
            ((Bunhalo) someThing).cleanBunhalo();
        }
    }

}
