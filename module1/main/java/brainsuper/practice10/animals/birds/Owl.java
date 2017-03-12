package brainsuper.practice10.animals.birds;

/**
 * Created by citsym on 12.02.17.
 */
public class Owl extends Bird {

    static int countOfOwls;

    int owlNumber;

    public Owl() {
        countOfOwls++;
        owlNumber = countOfOwls;
        setFoodName("mouse");
    }

    @Override
    public void feed() {
        super.feed(owlNumber);
    }
}
