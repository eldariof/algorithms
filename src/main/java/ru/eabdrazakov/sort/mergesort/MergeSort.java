package ru.eabdrazakov.sort.mergesort;


public class MergeSort {
	
	/**
	 * 
	 * @param arrayA
	 * @param arrayB
	 * @return 
	 */
	public int[] intersect(int[] arrayA, int[] arrayB) {
		
		return mergeSort(arrayA, arrayA.length, arrayB, arrayB.length, new int[arrayA.length + arrayB.length]);
		
	}
	
	private int[] mergeSort(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arraySum) {
		
		int[] arrayInterSect = new int[0];
		
		int arrayAIndex = 0, arrayBIndex = 0, arraySumIndex = 0, arrayInterSectIndex = 0;

	    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
	    	if (arrayA[arrayAIndex] < arrayB[arrayBIndex]) {
	    		if (arraySumIndex != 0 && (arraySum[--arraySumIndex] == arrayA[arrayAIndex])) {
	    			arrayInterSect = incArray(arrayInterSect);
	    			arrayInterSect[arrayInterSectIndex++] = arrayA[arrayAIndex];
	    		}
	    		arraySum[arraySumIndex++] = arrayA[arrayAIndex++];
	    	} else {
	    		arraySum[arraySumIndex++] = arrayB[arrayBIndex++];
	    	}

	    while (arrayAIndex < sizeA) {
	    	if (arraySum[--arraySumIndex] == arrayA[arrayAIndex]) {
	    		arrayInterSect = incArray(arrayInterSect);
	    		arrayInterSect[arrayInterSectIndex++] = arrayA[arrayAIndex];
	    	}
	    	arraySum[arraySumIndex++] = arrayA[arrayAIndex++];
	    }

	    while (arrayBIndex < sizeB) {
	    	if (arraySum[--arraySumIndex] == arrayB[arrayBIndex]) {
    			arrayInterSect = incArray(arrayInterSect);
	    		arrayInterSect[arrayInterSectIndex++] = arrayB[arrayBIndex];
	    	}
	    	arraySum[arraySumIndex++] = arrayB[arrayBIndex++];
	    }
	    
		return arrayInterSect;
	}
	
	private int[] incArray(int[] array) {
		int[] newArray = new int[array.length + 1];
		System.arraycopy(array, 0, newArray, 0, array.length);		
		return newArray;
	}

}
