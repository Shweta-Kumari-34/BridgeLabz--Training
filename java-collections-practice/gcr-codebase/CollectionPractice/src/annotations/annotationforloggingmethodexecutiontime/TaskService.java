package annotations.annotationforloggingmethodexecutiontime;

public class TaskService {

    @LogExecutionTime
    public void fastTask() {
        // simple loop
        for (int i = 0; i < 100000; i++) {
        }
    }

    @LogExecutionTime
    public void slowTask() {
        // slower task
        for (int i = 0; i < 10000000; i++) {
        }
    }
}
