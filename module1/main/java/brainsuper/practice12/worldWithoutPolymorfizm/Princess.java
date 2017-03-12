package brainsuper.practice12.worldWithoutPolymorfizm;

import brainsuper.practice10.animals.Animal;

/**
 * Created by citsym on 26.02.17.
 */
public class Princess extends Animal implements Eater, CanBeFunWith {

    public void naymNyam(){
        System.out.println("eats butter");
    }


    {

        setFoodName("butter");
    }

    @Override
    public void drinkABeer() {
        System.out.println(simpleName + " drinks some beer");
    }

    @Override
    public void tellAJoke() {
        System.out.println(simpleName + " tells funny joke");
    }
}
