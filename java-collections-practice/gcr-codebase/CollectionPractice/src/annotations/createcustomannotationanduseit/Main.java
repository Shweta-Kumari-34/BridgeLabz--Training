package annotations.createcustomannotationanduseit;
import java.lang.reflect.Method;

/**
 * Reads and prints @TaskInfo annotations from TaskManager class
 */
public class Main{
	 public static void main(String[] args) {
	        try {
	            // load the TaskManager class
	            Class<TaskManager> clazz = TaskManager.class;

	            // iterate over all declared methods
	            for (Method method : clazz.getDeclaredMethods()) {
	                // check if method has TaskInfo annotation
	                if (method.isAnnotationPresent(TaskInfo.class)) {
	                    TaskInfo info = method.getAnnotation(TaskInfo.class);
	                    System.out.println("Method: " + method.getName());
	                    System.out.println("Priority: " + info.priority());
	                    System.out.println("Assigned To: " + info.assignedTo());
	                    System.out.println("----------------------");
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}