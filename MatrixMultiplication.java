import java.util.Scanner;

class MatrixMultiplication {

    int row, col;
    int[][] matrix;

    // Constructor
    MatrixMultiplication(int r, int c) {
        row = r;
        col = c;
        matrix = new int[row][col];
    }

    // Method to input matrix
    void input(Scanner sc) {
        System.out.println("Enter elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to multiply matrices
    MatrixMultiplication multiply(MatrixMultiplication m2) {
        MatrixMultiplication result = new MatrixMultiplication(this.row, m2.col);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < m2.col; j++) {
                for (int k = 0; k < this.col; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        MatrixMultiplication m1 = new MatrixMultiplication(r1, c1);
        MatrixMultiplication m2 = new MatrixMultiplication(r2, c2);

        System.out.println("Matrix A:");
        m1.input(sc);

        System.out.println("Matrix B:");
        m2.input(sc);

        MatrixMultiplication result = m1.multiply(m2);

        System.out.println("Resultant Matrix:");
        result.display();

        sc.close();
    }
}