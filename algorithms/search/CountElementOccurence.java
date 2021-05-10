package algorithms.search;

public class CountElementOccurence {
	
	/*
	 * Given a sorted array of integers, find the frequency of the occurrence of a given target value in the array.
	 * If the value is not found in the array at all, return 0.
	 */
	public static int calcFreq(int arr[], int key) {

	  int leftMost = binarySearchIndex(arr, key, true);

	  if(leftMost != -1) {
	      int rightMost = binarySearchIndex(arr, key, false);
	      return rightMost - leftMost + 1;
	  }
	  return -1;
	}

	private static int binarySearchIndex(int arr[], int key, boolean isLeftMostNeeded) {
	     int min = 0;
	     int max = arr.length - 1;
	     int index = -1;
	
	     while (min <= max) {
	         int mid = (min + max) / 2;
	         if(key < arr[mid]) {
	             max = mid - 1;
	         } else if(key > arr[mid]) {
	            min = mid + 1;
	         } else {
	             index = mid;
	             if(isLeftMostNeeded) {
	                 max = mid - 1;
	             } else {
	                 min = mid + 1;
	             }
	         }
	     }
	     return index;
	 }
}
