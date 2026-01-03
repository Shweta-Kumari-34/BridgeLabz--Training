package com.objectdiagram.schoolresultapplication;



public class GradeCalculator {

    public float calculatePercentage(Student student) {
        int totalMarks = student.getTotalMarks();
        int totalSubjects = student.getSubjects().size();
        return (float) totalMarks / (totalSubjects * 100) * 100;
    }

    public String generateGrade(float percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 45) return "C";
        else return "D";
    }
}
