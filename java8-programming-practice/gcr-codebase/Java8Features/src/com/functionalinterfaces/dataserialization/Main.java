package com.functionalinterfaces.dataserialization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> data = new ArrayList<>();
        data.add(new Employee("Alice", 101));
        data.add(new Department("HR"));
        data.add(new Employee("Bob", 102));

        BackupProcessor backupProcessor = new BackupProcessor();
        backupProcessor.backupData(data);
    }
}

