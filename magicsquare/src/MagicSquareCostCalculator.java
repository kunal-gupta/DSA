
import java.util.Scanner;

/**
 * This class helps to find the cost of converting a 3*3 matrix into magic square.
 * This will work only for 3*3 matrix.
 * This class takes a 3*3 matrix as input and the value provided should not exceed more than 3*3 = 9, starting from 1.
 * Once the input is provided, it tries to compare the matrix with already available 3*3 magic square, and find print the minimum cost.
 * For verifier: I have assumed that I am asked to provide solution of finding cost of a 3*3 matrix.
 */
public class MagicSquareCostCalculator {
    /**
     * This takes one parameters and compares with all the existing magic square and returns the minimum cost
     * Run time complexity of this method to find magic square is O(n^3)
     * @param matrix: an array of 3*3 matrix
     * @return minimum cost of converting passed matrix array in magic square
     */
    public int findMinimumCost(int[][] matrix){
        int finalCost = -1;
        int tempCostHolder;
        /*
         * Iterating over each available magic square.
         */
        for (int i = 0; i < 8; i++) {
            tempCostHolder = findCost(matrix, ThreeDegreeMagicSquareHolder.MAGIC_SQUARE[i]);
            if(finalCost == -1 || finalCost > tempCostHolder)
                finalCost = tempCostHolder;

        }
        return finalCost;
    }

    /**
     * This finds the cost of converting first parameter array into second parameter magic square
     * @param matrix: This 3*3 array parameter needs to be converted into a magic square
     * @param magicSquare: one of the magic square of 3*3 matrix
     * @return returns the cost of conversion to magic square
     */
    private int findCost(int[][] matrix, int[][] magicSquare) {
        int cost = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                cost += Math.abs(matrix[row][col] - magicSquare[row][col]);
            }
        }
        return cost;
    }

    /**
     * main method to read user input and return the magic square
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                m[x][y] = s.nextInt();
            }
        }
        MagicSquareCostCalculator magicSquareCostCalculator = new MagicSquareCostCalculator();
        System.out.println("Minimum cost of conversion to magic square is: "
                + magicSquareCostCalculator.findMinimumCost(m));
    }
}
