package com.inheritance.educationalcoursehierarchy;

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    
    void showDetails() {
        super.showDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Lectures: " + (isRecorded ? "Yes" : "No"));
    }
}
