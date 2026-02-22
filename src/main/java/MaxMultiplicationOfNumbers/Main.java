package MaxMultiplicationOfNumbers;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = Arrays.stream(reader.readLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(array);

        int n = array.length;

        long productRight = (long) array[n - 2] * array[n - 1];
        long productLeft = (long) array[0] * array[1];

        if(productRight >= productLeft) {
            writer.write(array[n - 2] + " " + array[n - 1]);
        }
        else {
            writer.write(array[0] + " " + array[1]);
        }

        reader.close();
        writer.close();
    }
}
