package com.gmail.arsenycholexandra.homework6.level2;

public class Task3 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 3}; 
	    for (int startPos = 0; startPos < arr.length; startPos++) {
	        for (int sequenceLength = 1; sequenceLength <= (arr.length - startPos) / 2; sequenceLength++) {
	            boolean sequencesAreEqual = true;
	            for (int i = 0; i < sequenceLength; i++) {
	                if (arr[startPos + i] != arr[startPos + sequenceLength + i]) {
	                    sequencesAreEqual = false;
	                    break;
	                }
	                System.out.println();
	            }
	            if (sequencesAreEqual) {
	            	for (int i = 0; i < sequenceLength; i++) {
	            		System.out.print( arr[startPos + i]);
	            	}
	                
	            }
	        }
	    }
	}

}