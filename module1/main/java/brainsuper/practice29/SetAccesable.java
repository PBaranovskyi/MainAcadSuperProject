package brainsuper.practice29;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by citsym on 20.05.17.
 */
public class SetAccesable {

    public static void main(String[] args) throws IllegalAccessException {
        UseClasses someInstance = new UseClasses();


//        someInstance.gdfdgg = "SomeValue";



        Class<? extends UseClasses> aClass = someInstance.getClass();


        for (Field field : aClass.getDeclaredFields()) {

            if (field.getName().equals("testField")){
                field.setAccessible(true);
                field.set(someInstance, "SomeValue");
                field.setAccessible(false);
            }

            int modifiers = field.getModifiers();
            if (Modifier.isFinal(modifiers) && Modifier.isStatic(modifiers)) {
                System.out.println("Final field " + field.getName());
            }
        }


        System.out.println("OUR VALUE : " + someInstance.getTestField());

    }
}
