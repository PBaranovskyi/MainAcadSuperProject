package brainsuper.practice17;

/**
 * Created by citsym on 18.03.17.
 */
public class UseCoclailMaker {

    public static void main(String[] args) {


//        ob = new Object();
        CoctlailMaker<GreenCoctail, Grass> coctlailMakerECO = new CoctlailMaker<>(new GreenCoctail(), new Grass());

        GreenCoctail greenCoctail = coctlailMakerECO.makeCoctail(new CanBeBlended<GreenCoctail>() {
            @Override
            public GreenCoctail blend() {
                return null;
            }
        });

//        CoctlailMaker<BananaCoctail, Banana> bananaCoctlailMaker = new CoctlailMaker<>();
//
//
//        coctlailMakerECO = bananaCoctlailMaker;
//
//        BananaCoctail bananaCoctail = bananaCoctlailMaker.makeCoctail(new Banana());


        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer res = testGenerics(arr1, 2);
    }

    private static <T> T testGenerics(T[] arr1, int i) {

        return arr1[i];
    }
}
