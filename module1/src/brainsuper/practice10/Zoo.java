package brainsuper.practice10;

import brainsuper.practice10.animals.Animal;
import brainsuper.practice10.animals.birds.Bird;
import brainsuper.practice10.animals.birds.Owl;
import brainsuper.practice10.animals.mammals.Elephant;

import java.util.Arrays;

/**
 * Created by citsym on 12.02.17.
 */
public class Zoo {


    public static void main(String[] args) {

        Animal[] animals = new Animal[0];

        animals = addAnimalToTheZoo(animals, new Animal());

        feedAllAnimals(animals);

        animals = addAnimalToTheZoo(animals, new Animal());

        feedAllAnimals(animals);

        animals = addAnimalToTheZoo(animals, new Elephant());
        animals = addAnimalToTheZoo(animals, new Elephant());
        animals = addAnimalToTheZoo(animals, new Elephant());
        animals = addAnimalToTheZoo(animals, new Elephant());
        animals = addAnimalToTheZoo(animals, new Elephant());
        animals = addAnimalToTheZoo(animals, new Elephant());
        animals = addAnimalToTheZoo(animals, new Bird());
        animals = addAnimalToTheZoo(animals, new Bird());
        animals = addAnimalToTheZoo(animals, new Bird());
        animals = addAnimalToTheZoo(animals, new Owl());
        animals = addAnimalToTheZoo(animals, new Bird());

        feedAllAnimals(animals);


//        new Elephant();
//        new Owl();
//        new Animal();
//        new Elephant();
//
//        feedAllAnimals(Animal.getAnimals());

    }

    public static Animal[] addAnimalToTheZoo(Animal[] animals, Animal newAnimal) {
        Animal[] newAnimalsArray = Arrays.copyOf(animals, animals.length + 1);

        newAnimalsArray[newAnimalsArray.length - 1] = newAnimal;

        return newAnimalsArray;
    }

    private static void feedAllAnimals(Animal[] animals) {
        System.out.println("=====================");
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
