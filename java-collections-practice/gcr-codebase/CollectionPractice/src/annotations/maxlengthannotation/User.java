package annotations.maxlengthannotation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    // constructor with validation logic
    public User(String username) {

        // validate field length using annotation
        validateMaxLength(username);

        this.username = username;
    }

    private void validateMaxLength(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                if (value.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        "username length should not exceed " + maxLength.value()
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

