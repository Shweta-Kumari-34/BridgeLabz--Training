package annotations.implementrolebasedaccesscontrol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// custom annotation for role-based access
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RoleAllowed {
    String value();
}

