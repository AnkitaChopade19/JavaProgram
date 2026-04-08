package com.ai;

class Student extends Person implements Attendable {
    void getDetails() {
        System.out.println("Student Details");
    }

    public void markAttendance() {
        System.out.println("Marked Student Attendance ");
    }
}