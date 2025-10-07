class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    public Matrix(int[][] values) {
        this.rows = values.length;
        this.cols = values[0].length;
        data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = values[i][j];
            }
        }
    }
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition!");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix subtract(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction!");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Invalid matrix dimensions for multiplication!");
        }

        Matrix result = new Matrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[j][i] = this.data[i][j];
            }
        }
        return result;
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8, 9},
            {1, 2, 3}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        System.out.println("Matrix A:");
        m1.display();

        System.out.println("Matrix B:");
        m2.display();

        System.out.println("Addition:");
        m1.add(m2).display();

        System.out.println("Subtraction:");
        m1.subtract(m2).display();

        System.out.println("Transpose of A:");
        m1.transpose().display();
        int[][] c = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        Matrix m3 = new Matrix(c);
        System.out.println("Matrix C:");
        m3.display();

        System.out.println("A x C:");
        m1.multiply(m3).display();
    }
}