/* Given an integer array of coins[ ] of size N representing different types of currency and an integer sum, The task is to find the number of ways to make sum by using different combinations from coins[].  

Note: Assume that you have an infinite supply of each type of coin. 

Examples: 

Input: sum = 4, coins[] = {1,2,3}, 
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}. 


Input: sum = 10, coins[] = {2, 5, 3, 6}
Output: 5
Explanation: There are five solutions: 
{2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. */

public class changeCoin {
     // Returns the count of ways we can
    // sum coins[0...n-1] coins to get sum "sum"
    static int count(int coins[], int n, int sum)
    {
 
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0)
            return 1;
 
        // If sum is less than 0 then no
        // solution exists
        if (sum < 0)
            return 0;
 
        // If there are no coins and sum
        // is greater than 0, then no
        // solution exist
        if (n <= 0)
            return 0;
 
        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return count(coins, n - 1, sum)
            + count(coins, n, sum - coins[n - 1]);
    }
 
    // Driver code
    public static void main(String args[])
    {
        int coins[] = { 1, 2, 3 };
        int n = coins.length;
 
        System.out.println(count(coins, n, 4));
    }
}
// Explain what is a greedy algorithm and how dynamic programming helps in this case
/* The upper solution is using the recurtion and for that it used it own sub problems to solved the problems 
 * What are greedy algorithms used for?
Greedy algorithms are simple instinctive algorithms used for optimization (either maximized or minimized) problems. 
This algorithm makes the best choice at every step and attempts to find the optimal way to solve the whole problem.
* Dynamic Programming helps this programme by using a 2D array by saving common repeated value in the array
 */


//  given a number N, remove one digit and print the largest possible number.

class largestNumberPossible{

    static void maxnumber(int n, int k)
    {
        // Generate the largest number
        // after removal of the least
        // K digits one by one
        for (int j = 0; j < k; j++) {
            int i = 1;
 
            // Remove the least digit
            // after every iteration
            while (n / i > 0) {
 
                // Store the numbers formed after
                // removing every digit once
                int temp = (n / (i * 10))
                               * i
                           + (n % i);
                i *= 10;
 
                
                 System.out.println(temp);
            }
            
        }
    }
    public static void main(String[] args)
    {
        int n = 6358;
        int k = 1;
 
        maxnumber(n, k);
    }
}