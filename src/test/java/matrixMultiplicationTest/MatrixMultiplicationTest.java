package matrixMultiplicationTest;

import matrixMultiplication.MatrixMultiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixMultiplicationTest
{
    MatrixMultiplication matrixMultiplication = new MatrixMultiplication();

    @Test
    public void shouldOutputTranspondedMatrix() throws Exception
    {
        int[][] matrix = {{0, 0, 0}, {2, 4, 6}};

        String expected = "0 2 \n" + "0 4 \n" + "0 6 \n";
        String result = matrixMultiplication.outputTranspondedMatrix(2, 3, matrix);

        Assertions.assertEquals(expected, result);
    }
}
