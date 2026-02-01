package com.functionalinterfaces.sensitivedata;

public class User implements SensitiveData {
    private String name;
    private String ssn; // Social Security Number

    public User(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', ssn='" + ssn + "'}";
    }
}

