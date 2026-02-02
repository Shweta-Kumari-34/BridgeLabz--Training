package com.foreachmethod.eventattendee;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeApp {

    public static void main(String[] args) {

        // list of event attendees
        List<String> attendees = Arrays.asList(
                "Aman", "Neha", "Ravi", "Priya"
        );

        // using forEach with lambda to print welcome message
        attendees.forEach(name -> 
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

