package annotations.annotationforloggingmethodexecutiontime;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();

        // executing annotated methods
        ExecutionTimeLogger.execute(service);
    }
}
