class Solution {
    public boolean divisorGame(int n) {
        
        boolean[] dp = new boolean[n + 1];

        // Iterate through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check all possible moves
            for (int x = 1; x < i; x++) {
                // If x is a divisor of i
                if (i % x == 0) {
                    // If there's a move that leads to a losing state for Bob
                    if (!dp[i - x]) {
                        dp[i] = true; // Alice can win from this state
                        break;
                    }
                }
            }
        }

        return dp[n]; // Return if Alice can win starting with n
    
    }
}