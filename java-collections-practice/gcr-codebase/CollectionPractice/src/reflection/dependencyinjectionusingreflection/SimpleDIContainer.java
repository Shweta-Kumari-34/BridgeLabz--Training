package reflection.dependencyinjectionusingreflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class SimpleDIContainer {
	// Generic method to create object and inject dependencies
	public static <T> T createObject(Class<T> clazz) {

		try {
			// Create main object dynamically
			T obj = clazz.getDeclaredConstructor().newInstance();

			// Scan all fields of the class
			for (Field field : clazz.getDeclaredFields()) {

				// Check if field has @Inject annotation
				if (field.isAnnotationPresent((Class<? extends Annotation>) Inject.class)) {

					// Allow access to private field
					field.setAccessible(true);
					// Create dependency object dynamically
					Object dependency = field.getType().getDeclaredConstructor().newInstance();

					// Inject dependency
					field.set(obj, dependency);
				}
			}

			return obj;

		} catch (Exception e) {
			System.out.println("Dependency injection failed");
			return null;
		}
	}
}
