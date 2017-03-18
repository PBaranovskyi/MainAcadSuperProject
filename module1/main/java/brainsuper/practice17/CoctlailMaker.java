package brainsuper.practice17;

/**
 * Created by citsym on 18.03.17.
 */
public class CoctlailMaker<E, T extends CanBeBlended<E>> {


    public E  makeCoctail(T ingredient){
        return ingredient.blend();
    }
}
