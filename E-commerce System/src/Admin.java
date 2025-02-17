import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    public List<String> permissions;

    public Admin (String userId, List<String> permissions) {
        super();
        this.permissions = new ArrayList<>(permissions);
        this.userId = userId;
    }
    public void addPermission (String permission) {
        permissions.add(permission);
        System.out.println("Permission "+ permission + " added for Admin "+ name+".");
    }
    public void viewPermissions(){
        System.out.println("Permissions for Admin: ");
        for (String permission : permissions) {
            for(int i = 1; i <= permission.length(); i++){
                System.out.println(i +". "+permission);
            }
        }
    }

}
