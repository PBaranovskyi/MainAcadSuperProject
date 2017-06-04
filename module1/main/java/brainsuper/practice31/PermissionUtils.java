package brainsuper.practice31;

import java.lang.reflect.Method;

/**
 * Created by citsym on 27.05.17.
 */
public class PermissionUtils {

    public static void processPermission(Class clazz, User user, String methodName, Command command, Class... parameters) throws NoSuchMethodException {
        Method writeMethod = clazz.getDeclaredMethod(methodName, parameters);
        MyPermission declaredAnnotation = writeMethod.getDeclaredAnnotation(MyPermission.class);
        PermissionAction[] value = declaredAnnotation.value();


        boolean hasPermission = false;
        for (PermissionAction permissionAction : value) {
            if (user.getPermissions().contains(permissionAction)) {
                hasPermission = true;
            }
        }

        if (hasPermission) {
            command.execute();
            System.out.println("User " + user.getName() + " successfully " + methodName + " file");
        } else {
            System.out.println("User " + user.getName() + " can`t " + methodName + " file");
        }
    }


    public static boolean processPermission(Class clazz, User user, String methodName, Class... parameters) throws NoSuchMethodException {
        Method writeMethod = clazz.getDeclaredMethod(methodName, parameters);
        MyPermission declaredAnnotation = writeMethod.getDeclaredAnnotation(MyPermission.class);
        PermissionAction[] value = declaredAnnotation.value();


        boolean hasPermission = false;
        for (PermissionAction permissionAction : value) {
            if (user.getPermissions().contains(permissionAction)) {
                hasPermission = true;
            }
        }

        if (hasPermission) {
            System.out.println("User " + user.getName() + " successfully " + methodName + " file");
            return true;
        } else {
            System.out.println("User " + user.getName() + " can`t " + methodName + " file");
            return false;
        }
    }

    @FunctionalInterface
    public interface Command {
        void execute();
    }
}
