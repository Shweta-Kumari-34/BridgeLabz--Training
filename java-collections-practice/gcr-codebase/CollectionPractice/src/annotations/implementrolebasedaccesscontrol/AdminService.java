package annotations.implementrolebasedaccesscontrol;

//only ADMIN role can access this class
@RoleAllowed("ADMIN")
public class AdminService {

 public void performAdminTask() {
     System.out.println("admin task executed successfully");
 }
}

