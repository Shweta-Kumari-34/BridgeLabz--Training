package iostreamscenariobased.ScenarioBased.markmateapp;

import java.io.*;
import java.util.*;

public class CsvReaderUtil {

    public static List<String[]> readCSV(String filePath) throws IOException {
        List<String[]> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        br.readLine(); 

        while ((line = br.readLine()) != null) {
            records.add(line.split(","));
        }
        br.close();
        return records;
    }
}

