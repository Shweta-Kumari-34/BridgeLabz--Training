package com.inheritance.educationalcoursehierarchy;

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double finalFee() {
        return fee - (fee * discount / 100);
    }

    
    void showDetails() {
        super.showDetails();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Payable Fee: ₹" + finalFee());
        System.out.println("--------------------------------");
    }
}