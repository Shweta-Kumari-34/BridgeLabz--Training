package reflection.customloggingproxyusingreflection;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {

		// Create original object
		Greeting greeting = new GreetingImpl();

		// Create proxy object
		Greeting proxy = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(), // Class loader
				new Class[] { Greeting.class }, // Interfaces
				new LoggingHandler(greeting) // Invocation handler
		);

		// Call method using proxy
		proxy.sayHello();
	}
}
