package algorithms.search;

public class SearchInsertPosition {
	
	/*
	 * Given a sorted array and a target value, return the index where the target value would be if it were inserted in order. 
	 * If the target index is already present in the array, return the index of where it is found. 
	 * You may assume that no duplicates are in the array.
	 */
	public static int insertPosition(int arr[], int target) {
       int min = 0, max = arr.length - 1;
       int index = 0;

       while (min <= max) {
        int mid = (min + max) / 2;

           
        if(target == arr[mid]) {
            return mid;
        } else if(target > arr[mid]) {
            min = mid + 1;
            index = mid + 1;
        } else if(target < arr[mid]) {
            max = mid - 1;
            index = mid;
        }
       }

       return index;
	 }
}
