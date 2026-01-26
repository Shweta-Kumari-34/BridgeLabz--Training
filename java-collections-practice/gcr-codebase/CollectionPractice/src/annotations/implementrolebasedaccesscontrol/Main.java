package annotations.implementrolebasedaccesscontrol;

public class Main {
    public static void main(String[] args) {

        AdminService service = new AdminService();

        // admin user
        System.out.println("admin user:");
        RoleValidator.executeIfAllowed(service, "ADMIN");

        // normal user
        System.out.println("normal user:");
        RoleValidator.executeIfAllowed(service, "USER");
    }
}

