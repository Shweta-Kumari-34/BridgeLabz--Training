package annotations.implementcustomcachingsystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    // cache storage
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object param) {

        try {
            Method method = obj.getClass().getDeclaredMethod(methodName, int.class);

            // create cache key using method name and parameter
            String cacheKey = methodName + "_" + param;

            // check if method has CacheResult annotation
            if (method.isAnnotationPresent(CacheResult.class)) {

                // return cached value if present
                if (cache.containsKey(cacheKey)) {
                    System.out.println("returning cached result");
                    return cache.get(cacheKey);
                }

                // invoke method and cache result
                Object result = method.invoke(obj, param);
                cache.put(cacheKey, result);
                return result;
            }

            // if annotation not present, invoke normally
            return method.invoke(obj, param);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

