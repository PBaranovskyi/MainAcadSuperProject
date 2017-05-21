package brainsuper.practice10;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by citsym on 21.05.17.
 */
public class MaxProcessing {

    public static void sutUpAnnotations(Class... clazzes) throws IllegalAccessException, InstantiationException {


        for (Class clazze : clazzes) {

            for (Field field : clazze.getDeclaredFields()) {
                if (field.isAnnotationPresent(Max.class)){

                    Object[] o1 = (Object[]) field.get(null);

                    Max annotation = field.getAnnotation(Max.class);
                    o1 = Arrays.copyOf(o1, annotation.value());

                    System.out.println("THE LENGTH IS " + o1.length);
                }

            }

        }

    }

}
