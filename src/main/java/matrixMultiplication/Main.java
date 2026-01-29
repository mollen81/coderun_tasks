package matrixMultiplication;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        String inputNumbers = reader.readLine();
        int n = Integer.parseInt(inputNumbers.split(" ")[0]);
        int m = Integer.parseInt(inputNumbers.split(" ")[1]);
        int k = Integer.parseInt(inputNumbers.split(" ")[2]);

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[m][k];
        int[][] matrixC = new int[n][k];


        for(int i = 0; i < n; i++)
        {
            String[] line = reader.readLine().split(" ");
            for(int j = 0; j < m; j++)
            {
                matrixA[i][j] = Integer.parseInt(line[j]);
            }

        }


        for(int i = 0; i < m; i++)
        {
            String[] line = reader.readLine().split(" ");
            for(int j = 0; j < k; j++)
            {
                matrixB[i][j] = Integer.parseInt(line[j]);
            }
        }


        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                for(int c = 0; c < k; c++)
                {
                    matrixC[i][c] += matrixA[i][j] * matrixB[j][c];
                }
            }
        }


        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < k; j++)
            {
                System.out.println(matrixC[i][j] + " ");
            }
            System.out.println("\n");
        }



        reader.close();
        writer.close();
    }

    public void outputTranspondedMatrix(int n, int k, int[][] matrix)
    {
        for(int i = 0; i < k; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.println(matrix[j][i] + " ");
            }
            System.out.println("\n");
        }
    }
}
