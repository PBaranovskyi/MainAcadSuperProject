package brainsuper.practice10.animals;

import static brainsuper.practice12.worldWithoutPolymorfizm.ArraysUtils.addElementToArray;

/**
 * Created by citsym on 12.02.17.
 */
public abstract class Animal {

    private static Animal[] animals = new Animal[0];

    private String foodName = "food";

    protected Skin skin = new Skin();

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


    public Skin getSkin() {
        return skin;
    }

    public static class Skin {
        private String color;
        private int area;

        public Skin() {
        }

        public Skin(String color, int area) {
            this.color = color;
            this.area = area;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getArea() {
            return area;
        }

        public void setArea(int area) {
            this.area = area;
        }


        @Override
        public String toString() {
            return "Skin{" +
                    "color='" + color + '\'' +
                    ", area=" + area +
                    '}';
        }
    }

}
