package reflection.customloggingproxyusingreflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
public class LoggingHandler implements InvocationHandler{
	// Original object
    private Object target;

    // Constructor
    public LoggingHandler(Object target) {
        this.target = target;
    }

    // This method is called automatically when proxy method is invoked
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Log method name
        System.out.println("Method called: " + method.getName());

        // Call actual method on original object
        return method.invoke(target, args);
    }
}
