package com.objectdiagram.schoolresultapplication;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int rollNo;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public int getTotalMarks() {
        int total = 0;
        for (Subject s : subjects) {
            total += s.getMarks();
        }
        return total;
    }

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
}
