package iostreamscenariobased.ScenarioBased.markmateapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.util.List;

public class JsonExporter {

    public static void export(List<Student> students) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("report-card.json");
        gson.toJson(students, writer);
        writer.close();
    }
}

