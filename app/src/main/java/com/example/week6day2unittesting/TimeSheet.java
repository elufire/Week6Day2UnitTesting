package com.example.week6day2unittesting;

public class TimeSheet {
    private float payrate;
    private boolean isHourly;
    private float hoursWorked;

    public TimeSheet(float payrate, boolean isHourly, float hoursWorked) {
        this.payrate = payrate;
        this.isHourly = isHourly;
        this.hoursWorked = hoursWorked;
    }

    public TimeSheet() {
    }

    public float getPayrate() {
        return payrate;
    }

    public void setPayrate(float payrate) {
        this.payrate = payrate;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public void setHourly(boolean hourly) {
        isHourly = hourly;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
