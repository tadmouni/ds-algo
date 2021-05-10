package algorithms.search;

public class SearchInSortedMatrix {
	
	/*
	 * Implement a function that tells whether a given target is present in the sorted matrix or not.
	 */
	public static boolean findKey(int[][] matrix, int numberOfRows, int numberOfColumns, int target) {
	  int row = -1;

	  for(int i = 0; i < numberOfRows; i++) {
	      if(target >= matrix[i][0] && target <= matrix[i][numberOfColumns - 1]) {
	          row = i;
	          break;
	      }
	  }

	  if(row != -1) {
	      for(int i = 0; i < numberOfColumns; i++) {
	          if(matrix[row][i] == target) {
	              return true;
	          }
	      }
	  }

	  return false;
 	}
}
