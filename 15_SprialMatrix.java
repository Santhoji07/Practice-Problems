/*
54. Spiral Matrix
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return result;

        int rowStart = 0, rowEnd = matrix.length;
        int colStart = 0, colEnd = matrix[0].length;

        while (rowStart < rowEnd && colStart < colEnd) {

            // Traverse Right
            for (int i = colStart; i < colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            // Traverse Down
            for (int i = rowStart; i < rowEnd; i++) {
                result.add(matrix[i][colEnd - 1]);
            }
            colEnd--;

            // Traverse Left
            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    result.add(matrix[rowEnd - 1][i]);
                }
                rowEnd--;
            }

            // Traverse Up
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return result;
    }
}
