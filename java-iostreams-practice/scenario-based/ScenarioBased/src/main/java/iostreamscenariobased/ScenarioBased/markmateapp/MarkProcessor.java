package iostreamscenariobased.ScenarioBased.markmateapp;

import java.util.*;

public class MarkProcessor {

    public static List<Student> process(List<String[]> records) {
        List<Student> students = new ArrayList<>();

        for (String[] data : records) {
            try {
                int id = Integer.parseInt(data[0]);
                String name = data[1];

                int maths = Integer.parseInt(data[2]);
                int science = Integer.parseInt(data[3]);
                int english = Integer.parseInt(data[4]);

                int total = maths + science + english;
                double avg = total / 3.0;
                String grade = GradeCalculator.calculateGrade(avg);

                students.add(new Student(id, name, total, avg, grade));

            } catch (NumberFormatException e) {
                System.out.println(" Invalid marks for student: " + data[1]);
            }
        }
        return students;
    }
}

