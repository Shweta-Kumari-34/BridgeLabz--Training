package iostreamscenariobased.ScenarioBased.markmateapp;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<String[]> records =
                CsvReaderUtil.readCSV("D:\\java file\\Resume\\mark.csv");

        List<Student> students =
                MarkProcessor.process(records);

        JsonExporter.export(students);

        System.out.println(" Report Card Generated Successfully!");
    }
}

