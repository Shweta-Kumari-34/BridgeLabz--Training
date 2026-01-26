package annotations.implementcustomserialization;

import java.lang.reflect.Field;

public class JsonSerializer {

    // converts object to json string
    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder("{");
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);

                try {
                    json.append("\"")
                        .append(annotation.name())
                        .append("\":");

                    Object value = field.get(obj);

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    json.append(",");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // remove last comma
        if (json.charAt(json.length() - 1) == ',') {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}

