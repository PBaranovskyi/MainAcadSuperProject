package brainsuper.practice10.animals.birds;

import brainsuper.practice10.animals.Animal;

/**
 * Created by citsym on 12.02.17.
 */
public class Bird extends Animal{
    static int countOfBirds;

    int birdNumber;

    public Bird() {
        countOfBirds++;
        birdNumber = countOfBirds;
        setFoodName("seeds");
    }


    @Override
    public void feed() {
        super.feed(birdNumber);
    }
}
