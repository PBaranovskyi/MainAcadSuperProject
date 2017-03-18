package brainsuper.practice17;

import brainsuper.practice12.worldWithoutPolymorfizm.sort.Car;

/**
 * Created by citsym on 18.03.17.
 */
public class UseCoclailMaker {

    public static void main(String[] args) {

        CoctlailMaker<GreenCoctail, Grass> coctlailMaker = new CoctlailMaker<>();

        GreenCoctail greenCoctail = coctlailMaker.makeCoctail(new Grass());
    }
}
