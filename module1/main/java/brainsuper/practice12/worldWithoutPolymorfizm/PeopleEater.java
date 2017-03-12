package brainsuper.practice12.worldWithoutPolymorfizm;

import brainsuper.practice10.animals.Animal;

/**
 * Created by citsym on 26.02.17.
 */
public class PeopleEater extends Animal implements Eater, CanBeFunWith {


    {
        setFoodName("people");
    }

    @Override
    public void drinkABeer() {
        System.out.println(simpleName + " drinks a lot of beer");
    }

    @Override
    public void tellAJoke() {
        System.out.println(simpleName + " tell stuped joke");
    }
}
