package brainsuper.practice31;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 27.05.17.
 */
public class Main {


    public static void main(String[] args) throws NoSuchMethodException {

        List<User> userList = getUsers();

        FileProcessor fileProcessor = new FileProcessor("text.txt");


        for (User user : userList) {
            fileProcessor.write(user, "New line");
            fileProcessor.read(user);
        }

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
