package brainsuper.practice18;

/**
 * Created by citsym on 19.03.17.
 */
class King {
    protected String victimName ;
    King() {
        System.out.println("Call King constructor");
        speech();
    }

    King(String victimName){
        this.victimName = victimName;
        System.out.println("Call King constructor");
        speech();
    }
    public void speech() {
        System.out.println("I'm the King of the Andals!");
    }
}
class AerysTargaryen extends King {


    AerysTargaryen(String victimName) {
        super(victimName);
        System.out.println("Call AerysTargaryen constructor");
        speech();
    }
    @Override
    public void speech() {
        System.out.println("Burn " + victimName + "!");
    }
}

public class Main {
    public static void main(String[] args) {
        King king = new AerysTargaryen("Lyana ");
    }
}
