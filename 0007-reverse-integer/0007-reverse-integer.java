class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10; // Get the last digit
            x /= 10; // Remove the last digit
            
            // Check for overflow before actually adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow condition for positive
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow condition for negative
            }
            
            reversed = reversed * 10 + digit; // Build the reversed number
        }
        
        return reversed;
        
    }
}