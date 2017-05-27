package brainsuper.practice31;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 27.05.17.
 */
public class User {

    private String name;
    private List<PermissionAction> permissions = new ArrayList<>();


    public User(String name) {
        this.name = name;
    }

    public void addPermission(PermissionAction permissionAction){
        permissions.add(permissionAction);
    }

    public List<PermissionAction> getPermissions() {
        return permissions;
    }


    public String getName() {
        return name;
    }
}
