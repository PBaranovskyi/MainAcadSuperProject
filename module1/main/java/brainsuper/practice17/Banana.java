package brainsuper.practice17;

/**
 * Created by citsym on 19.03.17.
 */
public class Banana implements CanBeBlended<BananaCoctail> {
    @Override
    public BananaCoctail blend() {
        return new BananaCoctail();
    }
}
