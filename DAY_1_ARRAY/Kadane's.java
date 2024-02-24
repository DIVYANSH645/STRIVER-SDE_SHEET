package DAY_1_ARRAY;
 class MaxSubArraySUM{
    
        // Function to find the maximum sum of a contiguous subarray
        public int maxSubArray(int[] arr) {
            int n = arr.length;
            int maxSum = Integer.MIN_VALUE; // Initialize the maximum sum to the lowest possible value
            int currSum = 0; // Initialize the current sum to 0
    
            // Iterate through the array to find the maximum sum of a contiguous subarray
            for (int i = 0; i < n; i++) {
                currSum += arr[i]; // Add the current element to the current sum
    
                // Update the maximum sum if the current sum is greater
                maxSum = Math.max(currSum, maxSum);
    
                // If the current sum becomes negative, reset it to 0
                if (currSum < 0) {
                    currSum = 0;
                }
            }
    
            return maxSum; // Return the maximum sum found
        }
    
        // Main function to test the maxSubArray method
        public static void main(String[] args) {
            // Example usage
       MaxSubArraySUM  solution = new MaxSubArraySUM();
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Sample array
            int maxSubArraySum = solution.maxSubArray(arr); // Calculate the maximum subarray sum
            System.out.println("Maximum subarray sum: " + maxSubArraySum); // Print the result
        }
    }
    
