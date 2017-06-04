package brainsuper.practice31;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 27.05.17.
 */
public class Main {


    public static final String FILE_PATH = "text.txt";

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        List<User> userList = getUsers();

        FileProcessor fileProcessor = new FileProcessor(FILE_PATH);

//
//        for (User user : userList) {
//            fileProcessor.write(user, "New line");
//            fileProcessor.read(user);
//        }


        ReadWrite instance = (ReadWrite) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ReadWrite.class}, new FileHandler(fileProcessor));

        instance.write(userList.get(1), "PROXY STRING");

        instance.read(userList.get(1));

        System.out.println("===============");







        ReadWrite instance2 = getProxyFileProcessor(FILE_PATH);

        instance2.write(userList.get(1), "PROXY STRING");

        instance2.read(userList.get(1));



    }

    private static ReadWrite getProxyFileProcessor(String filePath) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return (ReadWrite) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ReadWrite.class}, new FileHandler(FileProcessor.class, filePath));
    }

    public static List<User> getUsers() {

        List<User> list = new ArrayList<>();

        User user = new User("Petya");
        user.addPermission(PermissionAction.USER_READ);

        list.add(user);

        User admin = new User("Kolya");
        admin.addPermission(PermissionAction.USER_READ);
        admin.addPermission(PermissionAction.USER_CHANGE);

        list.add(admin);


        User superAdmin = new User("Sasha");
        superAdmin.addPermission(PermissionAction.USER_ADMIN);

        list.add(superAdmin);

        return list;

    }
}
