package com.stacksandqueue.circular_tour_problem;

public class CircularTour {

	    //find starting petrol pump index
	    public static int findStartingPump(PetrolPump[] pumps) {
	        int n = pumps.length;
	        int start = 0;       
	        int surplus = 0;      
	        int deficit = 0;      

	        for (int i = 0; i < n; i++) {
	            surplus += pumps[i].petrol - pumps[i].distance;

	            if (surplus < 0) {
	                start = i + 1;       
	                deficit += surplus;  
	                surplus = 0;         
	            }
	        }

	        // if total petrol >= total distance, tour is possible
	        if (surplus + deficit >= 0) {
	            return start;
	        } else {
	            return -1; 
	        }
	    }
	}

