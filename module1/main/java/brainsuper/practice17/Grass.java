package brainsuper.practice17;

/**
 * Created by citsym on 18.03.17.
 */
public class Grass implements CanBeBlended<GreenCoctail> {

    @Override
    public GreenCoctail blend() {
        return new GreenCoctail();
    }
}
