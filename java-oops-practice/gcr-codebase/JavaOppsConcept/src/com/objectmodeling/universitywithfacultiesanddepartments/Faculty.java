package com.objectmodeling.universitywithfacultiesanddepartments;

public class Faculty {
	private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + name + " | Subject: " + subject);
    }

    public String getName() {
        return name;
    }
}
