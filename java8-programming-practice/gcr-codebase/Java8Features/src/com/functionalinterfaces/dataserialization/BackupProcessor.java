package com.functionalinterfaces.dataserialization;

import java.util.List;

public class BackupProcessor {

    public void backupData(List<Object> objects) {
        for (Object obj : objects) {
            if (obj instanceof Backupable) {
                System.out.println("Backing up: " + obj);
            } else {
                System.out.println("Skipping: " + obj.getClass().getSimpleName());
            }
        }
    }
}

