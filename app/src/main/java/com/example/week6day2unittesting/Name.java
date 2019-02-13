package com.example.week6day2unittesting;

public class Name {
    private String firstName;
    private String middleName;
    private String lastname;
    private String namePrefix;

    public Name(String firstName, String middleName, String lastname, String namePrefix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastname = lastname;
        this.namePrefix = namePrefix;
    }

    public Name() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }
}
