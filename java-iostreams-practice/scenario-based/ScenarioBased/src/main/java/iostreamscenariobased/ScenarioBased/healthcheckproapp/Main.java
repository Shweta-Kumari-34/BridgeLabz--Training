package iostreamscenariobased.ScenarioBased.healthcheckproapp;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        scanController(LabController.class);
    }

    public static void scanController(Class<?> controllerClass) {

        System.out.println("\nScanning Controller: " + controllerClass.getSimpleName());
        System.out.println("--------------------------------------");

        Method[] methods = controllerClass.getDeclaredMethods();

        for (Method method : methods) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean isAuthAPI = method.isAnnotationPresent(RequiresAuth.class);

            if (isPublicAPI) {
                System.out.println("API: " + method.getName() + " | Type: Public API");
            } else if (isAuthAPI) {
                System.out.println("API: " + method.getName() + " | Type: Auth Required");
            } else {
                System.out.println("API: " + method.getName() + " | ERROR: Missing Annotation");
            }
        }
    }
}

