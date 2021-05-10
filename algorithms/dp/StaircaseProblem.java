package algorithms.dp;

public class StaircaseProblem {
	
	/*
	 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
	 * Implement a function to count the number of possible ways that the child can run up the stairs.
	 */
	public static int countWays(int n) {
		
		int[] lookupTable = new int[n+1]; // Initialize lookup table
        lookupTable[0] = 1; // Setting the first three values
        lookupTable[1] = 1;
        lookupTable[2] = 2;
    
        for (int i = 3; i <= n; i++) {
        	lookupTable[i] = lookupTable[i-1] + lookupTable[i-2] + lookupTable[i-3]; // Fill up the table by summing up previous two values
        }
    
        return lookupTable[n]; 
    }
}
