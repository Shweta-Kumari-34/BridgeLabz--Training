package annotations.implementrolebasedaccesscontrol;

import java.lang.reflect.Method;

public class RoleValidator {

    public static void executeIfAllowed(Object obj, String userRole) {

        Class<?> cls = obj.getClass();

        // check if RoleAllowed annotation is present
        if (cls.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);

            // validate role
            if (!roleAllowed.value().equals(userRole)) {
                System.out.println("access denied!");
                return;
            }
        }

        // invoke method if access is allowed
        try {
            Method method = cls.getDeclaredMethod("performAdminTask");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

