
import java.util.Arrays;
//optimal solution
class Solution {
//Time Complexity: O(2*(N*M)), where N = no. of rows in the matrix and M = no. of columns in the matrix.
// Reason: In this approach, we are also traversing the entire matrix 2 times and each traversal is taking O(N*M) time complexity.

// Space Complexity: O(1) as we are not using any extra space.
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowsArray = new int[m];
        int[] colsArray = new int[n];

        Arrays.fill(rowsArray, 1);
        Arrays.fill(colsArray, 1);

        // Iterate through the matrix to mark rows and columns where zeros are present
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowsArray[i] = 0;
                    colsArray[j] = 0;
                }
            }
        }

        // Iterate through the matrix again to zero out elements based on marked rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowsArray[i] == 0 || colsArray[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        // Call the setZeroes function
        solution.setZeroes(matrix);
        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }
    // Utility method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
