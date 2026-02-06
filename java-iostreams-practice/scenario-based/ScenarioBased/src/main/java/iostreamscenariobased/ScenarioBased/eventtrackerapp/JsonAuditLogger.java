package iostreamscenariobased.ScenarioBased.eventtrackerapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.util.List;

public class JsonAuditLogger {

    public static void log(List<AuditEvent> events) throws Exception {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter writer = new FileWriter("audit-log.json");
        gson.toJson(events, writer);
        writer.close();
    }
}

