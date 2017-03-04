package brainsuper.practice10;

import brainsuper.practice10.animals.Animal;
import brainsuper.practice10.animals.birds.Bird;
import brainsuper.practice10.animals.birds.Owl;
import brainsuper.practice10.animals.mammals.Elephant;

import static brainsuper.practice12.worldWithoutPolymorfizm.ArraysUtils.addElementToArray;

/**
 * Created by citsym on 12.02.17.
 */
public class Zoo {


    public static void main(String[] args) {

        Animal[] animals = new Animal[0];

        animals = addElementToArray(animals, new Animal());

        feedAllAnimals(animals);

        animals = addElementToArray(animals, new Animal());

        feedAllAnimals(animals);

        animals = addElementToArray(animals, new Elephant());
        animals = addElementToArray(animals, new Elephant());
        animals = addElementToArray(animals, new Elephant());
        animals = addElementToArray(animals, new Elephant());
        animals = addElementToArray(animals, new Elephant());
        animals = addElementToArray(animals, new Elephant());
        animals = addElementToArray(animals, new Bird());
        animals = addElementToArray(animals, new Bird());
        animals = addElementToArray(animals, new Bird());
        animals = addElementToArray(animals, new Owl());
        animals = addElementToArray(animals, new Bird());

        feedAllAnimals(animals);


//        new Elephant();
//        new Owl();
//        new Animal();
//        new Elephant();
//
//        feedAllAnimals(Animal.getAnimals());

    }



    private static void feedAllAnimals(Animal[] animals) {
        System.out.println("=====================");
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
