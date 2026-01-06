package com.linearandbinarysearch.compare_stringBuffer_with_stringbuilder_for_string_concatenation;

public class CompareStringBufferWithStringBuilder {
	    public static void main(String[] args) {

	        int iterations = 1000000;
	        String text = "hello";

	        // StringBuffer Testing
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }

	        long endBuffer = System.nanoTime();
	        long bufferTime = endBuffer - startBuffer;

	        //StringBuilder Testing
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }

	        long endBuilder = System.nanoTime();
	        long builderTime = endBuilder - startBuilder;

	        System.out.println("Time taken by StringBuffer is  : " + bufferTime + " ns");
	        System.out.println("Time taken by StringBuilder is : " + builderTime + " ns");
	    }
	}


