import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                // Input matrix dimensions
                System.out.print("Enter the number of rows: ");
                int rows = input.nextInt();
                System.out.print("Enter the number of columns: ");
                int cols = input.nextInt();

                // Input matrix elements
                int[][] matrix = new int[rows][cols];
                System.out.println("Enter the matrix elements:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = input.nextInt();
                    }
                }
                // Find and display peak-columns
                findPeakColumns(matrix, rows, cols);

                input.close();
            }

            public static void findPeakColumns(int[][] matrix, int rows, int cols) {
                for (int i = 0; i < rows; i++) {
                    int maxInRow = matrix[i][0];
                    int maxColIndex = 0;

                    // Find the maximum element in the current row
                    for (int j = 1; j < cols; j++) {
                        if (matrix[i][j] > maxInRow) {
                            maxInRow = matrix[i][j];
                            maxColIndex = j;
                        }
                    }

                    // Check if the maximum element in the row is the minimum in its column
                    boolean isPeakColumn = true;
                    for (int k = 0; k < rows; k++) {
                        if (matrix[k][maxColIndex] < maxInRow) {
                            isPeakColumn = false;
                            break;
                        }
                    }

                    // Display the peak-column element
                    if (isPeakColumn) {
                        System.out.println("(" + (i + 1) + "," + (maxColIndex + 1) + ") = " + maxInRow);
                    }
                }
    }


}


