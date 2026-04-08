package com.ai;

class Teacher extends Person implements Attendable {
    void getDetails() {
        System.out.println("Teacher Details");
    }

    public void markAttendance() {
        System.out.println("Marked Teacher Attendance ");
    }
}