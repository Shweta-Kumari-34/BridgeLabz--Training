package iostreamscenariobased.ScenarioBased.markmateapp;

public class GradeCalculator {

    public static String calculateGrade(double average) {
        if (average >= 90) return "A+";
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        return "Fail";
    }
}

