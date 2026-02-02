package com.workshop.smartcity;

//common interface for all transport services
public interface TransportService {

 // abstract method
 String getServiceName();

 // default method (Java 8)
 default void printServiceDetails() {
     System.out.println("Service: " + getServiceName());
 }
}

