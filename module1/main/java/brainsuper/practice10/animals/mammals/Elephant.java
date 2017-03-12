package brainsuper.practice10.animals.mammals;

/**
 * Created by citsym on 12.02.17.
 */
public class Elephant extends Mammal {

    static int countOfElephants;

    int elephantNumber;

    public Elephant() {
        countOfElephants++;
        elephantNumber = countOfElephants;
        setFoodName("grass");
    }


    public Elephant(Skin skin) {
        this.skin = skin;
    }


    @Override
    public void feed() {
        super.feed(elephantNumber);
    }
}
