package brainsuper.practice31;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static brainsuper.practice31.PermissionUtils.processPermission;

/**
 * Created by citsym on 27.05.17.
 */
public class FileHandler implements InvocationHandler {
    private FileProcessor target;

    public FileHandler(FileProcessor target) {
        this.target = target;
    }

    public FileHandler(Class<FileProcessor> clazz, String filePath) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        target = clazz.getConstructor(String.class).newInstance(filePath);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        List<Class<?>> collect = Arrays.asList(args).stream().map(Object::getClass).collect(Collectors.toList());

        Class[] classes = collect.toArray(new Class[collect.size()]);

        boolean hasPermission = processPermission(target.getClass(), (User) args[0], method.getName(), classes);
        if (hasPermission) {
            return method.invoke(target, args);
        } else {
            return null;
        }

    }
}
