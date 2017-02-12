package brainsuper.practice10.animals;

import brainsuper.practice10.Zoo;

/**
 * Created by citsym on 12.02.17.
 */
public class Animal {

    private static Animal[] animals = new Animal[0];

    private String foodName = "food";


    public Animal() {
        animals = Zoo.addAnimalToTheZoo(animals, this);
    }

    public void feed() {
        feed(0);
    }

    protected void feed(int animalNumber) {
        if (animalNumber == 0) {
            System.out.println(getClass().getSimpleName() + " eats " + getFoodName());
        } else {
            System.out.println(getClass().getSimpleName() + animalNumber + " eats " + getFoodName());
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
