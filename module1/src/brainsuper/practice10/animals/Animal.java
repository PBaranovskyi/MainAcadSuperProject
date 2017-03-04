package brainsuper.practice10.animals;

import static brainsuper.practice12.worldWithoutPolymorfizm.ArraysUtils.addElementToArray;

/**
 * Created by citsym on 12.02.17.
 */
public class Animal {

    private static Animal[] animals = new Animal[0];

    private String foodName = "food";

    protected String simpleName = getClass().getSimpleName();

    public Animal() {
        animals = addElementToArray(animals, this);
    }

    public void feed() {
        feed(0);
    }

    protected void feed(int animalNumber) {

        if (animalNumber == 0) {
            System.out.println(simpleName + " eats " + getFoodName());
        } else {
            System.out.println(simpleName + animalNumber + " eats " + getFoodName());
        }
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }


    public static Animal[] getAnimals() {
        return animals;
    }

}
