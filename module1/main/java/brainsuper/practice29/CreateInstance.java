package brainsuper.practice29;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by citsym on 20.05.17.
 */
public class CreateInstance {


    public static final String BRAINSUPER_PRACTICE10_CLONE_CAR = "brainsuper.practice10.clone.Car";
    public static final String BRAINSUPER_PRACTICE4 = "brainsuper.practice4.Car";

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {


        if (isDefaultConstructorExists(BRAINSUPER_PRACTICE10_CLONE_CAR)) {

            Class<?> aClass = Class.forName(BRAINSUPER_PRACTICE10_CLONE_CAR);

            Object o = aClass.newInstance();

            System.out.println(o.toString());

        };

    }

    private static boolean isDefaultConstructorExists(String className) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        boolean defaultCounstructorExists = false;

        Class<?> aClass = Class.forName(className);

        Class<?>[] parameterTypes = new Class[]{Date.class, int.class};


        try {
            Constructor<?> constructor = aClass.getConstructor(parameterTypes);

            System.out.println("EXISTS");

            Object car = constructor.newInstance(new Date(), 2000);

            System.out.println(car.toString());
        } catch (NoSuchMethodException e){
            System.out.println("No such constructor");
        }




//

//        for (Constructor<?> constructor : constructors) {
//            System.out.println("Constructor params: ");
//
//            for (Class<?> aClass1 : parameterTypes) {
//                System.out.print(" " + aClass1.getSimpleName());
//            }
//
//            System.out.println();
//
//            if (constructor.getParameterCount() == 0){
//                defaultCounstructorExists = true;
//            }
//        }

        Integer.valueOf(5).getClass();
        return defaultCounstructorExists;
    }


}
