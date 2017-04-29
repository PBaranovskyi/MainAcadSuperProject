package brainsuper.practice17;

/**
 * Created by citsym on 18.03.17.
 */
public class CoctlailMaker<E, T extends CanBeBlended<E>> {

    E some;

    CoctlailMaker(E some, CanBeBlended some1){
        this.some = some;
    }


    public E  makeCoctail(CanBeBlended<E> ingredient){
        E blend = ingredient.blend();
        E some;
        return blend;
    }


}
