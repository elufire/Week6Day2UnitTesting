package com.example.week6day2unittesting;

public class Employee {
    private Name fullName;
    private Address address;
    private TimeSheet timeSheet;

    public Employee() {
    }

    public Employee(Name fullName, Address address, TimeSheet timeSheet) {
        this.fullName = fullName;
        this.address = address;
        this.timeSheet = timeSheet;
    }


    public Name getFullName() {
        return fullName;
    }

    public void setFullName(Name fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public TimeSheet getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(TimeSheet timeSheet) {
        this.timeSheet = timeSheet;
    }
}
