package brainsuper.practice10.animals.birds;

import brainsuper.practice10.animals.Animal;

/**
 * Created by citsym on 12.02.17.
 */
public class Bird extends Animal{
    static int countOfBirds;

    private int birdNumber;
    private int seedsNumber;

    public void setSeedsNumber(int seedsNumber) {
        this.seedsNumber = seedsNumber;
    }

    public Bird() {
        countOfBirds++;
        birdNumber = countOfBirds;
        setFoodName("seeds");
    }

    public Bird(int seedsNumber) {
        this();
        this.seedsNumber = seedsNumber;
    }

    @Override
    public void feed() {
        super.feed(birdNumber);
    }

    public class Feather extends Animal.Skin{

        private int featherCount;

        public Feather(String color, int area, int featherCount) {
            super(color, area);
            this.featherCount = featherCount;
        }


        public int calculateFeatherCount(){
            featherCount = seedsNumber * 1000;
            return featherCount;
        }

    }
}
