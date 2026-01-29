package matrixMultiplication;

public class MatrixMultiplication
{
    public int[][] matrixMultiplication(int n, int m, int k, int[][] matrixA, int[][] matrixB)
    {
        int[][] matrixC = new int[n][k];


        return matrixC;
    }

    public String outputTranspondedMatrix(int n, int k, int[][] matrix)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++)
        {
            for(int j = 0; j < n; j++)
            {
                sb.append(matrix[j][i]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
