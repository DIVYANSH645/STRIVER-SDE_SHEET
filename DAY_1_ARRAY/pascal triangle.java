package DAY_1_ARRAY;
import java.util.*;
class ModifiedPascalTriangle {
    // Method to calculate nCr (binomial coefficient)
    public static int calculateBinomialCoefficient(int n, int r) {
        long result = 1;
        // Calculating nCr:
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return (int) result;
    }

    // Method to generate Pascal's triangle up to n rows
    public static List<List<Integer>> generatePascalsTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Populate the Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> rowList = new ArrayList<>(); // Temporary list to store elements of each row
            for (int col = 1; col <= row; col++) {
                rowList.add(calculateBinomialCoefficient(row - 1, col - 1));
            }
            triangle.add(rowList);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's triangle
        List<List<Integer>> pascalsTriangle = generatePascalsTriangle(n);
        // Print Pascal's triangle
        for (List<Integer> row : pascalsTriangle) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
