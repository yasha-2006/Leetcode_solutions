class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                // Even number of teams
                matches += n / 2;
                n = n / 2; // Half of the teams advance
            } else {
                // Odd number of teams
                matches += (n - 1) / 2;
                n = (n + 1) / 2; // One team advances, half of the rest advance
            }
        }

        return matches;
        
    }
}