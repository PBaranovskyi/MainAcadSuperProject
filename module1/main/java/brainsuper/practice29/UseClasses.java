package brainsuper.practice29;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by citsym on 20.05.17.
 */
public class UseClasses {

    public static final String BRAINSUPER_PRACTICE11_VEHICLE_CAR = "brainsuper.practice11.vehicle.Car";
    String testVariable;
    final String sdfsdf= "test";
    static final String DFG = "test";
    private String testField;
    String dfggdfgdgdfg;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {


        Class<? extends UseClasses> useClassesClass = UseClasses.class;

        UseClasses someInstance = new UseClasses();


        someInstance.testField = "SomeValue";



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




        int[] arrint = new int[10];

        System.out.println(arrint.getClass().getCanonicalName());


        Class<Double> doublePrimitiveClass = Double.TYPE;

        getSuperClass(BRAINSUPER_PRACTICE11_VEHICLE_CAR);

    }

    private static void getSuperClass(String clazz) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(clazz);

        System.out.println("SUPER CLASS IS " + aClass.getSuperclass().getSimpleName());

    }


    public String getTestField() {
        return testField;
    }
}
