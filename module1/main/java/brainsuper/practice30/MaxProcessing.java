package brainsuper.practice30;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 21.05.17.
 */
public class MaxProcessing {

    public static void sutUpAnnotations(Class... clazzes) throws IllegalAccessException, InstantiationException {


        for (Class clazze : clazzes) {

            for (Field field : clazze.getDeclaredFields()) {
                if (field.isAnnotationPresent(Max.class)){
                    Max annotation = field.getAnnotation(Max.class);

                    Object o = field.get(null);
                    if (o instanceof List) {
                        List o1 = (List) o;

                        o1 = new ArrayList(o1) {
                            @Override
                            public boolean add(Object o) {
                                if (size() == annotation.value()) {
                                    System.out.println("OVERFLOW");
                                    return false;
                                }
                                return super.add(o);
                            }
                        };

                        field.set(null, o1);
                    }

                }

            }

        }

    }

}
