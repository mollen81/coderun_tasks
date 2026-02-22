package MaxMultiplicationOfNumbers;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> array = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        int[] maxPositive = new int[] {0, 0};
        int[] maxNegative = new int[] {0, 0};

        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) > maxPositive[0] || array.get(i) > maxPositive[1]) {
                if (maxPositive[0] == 0) maxPositive[0] = array.get(i);
                else if (maxPositive[1] == 0) maxPositive[1] = array.get(i);

                else  {
                    if (array.get(i) > maxPositive[0]) maxPositive[0] = array.get(i);
                    else maxPositive[1] = array.get(i);
                }
            }

            if(array.get(i) < maxNegative[0] || array.get(i) < maxNegative[1]) {
                if (maxNegative[0] == 0) maxNegative[0] = array.get(i);
                else if (maxNegative[1] == 0) maxNegative[1] = array.get(i);

                else {
                    if (array.get(i) < maxNegative[0]) maxNegative[0] = array.get(i);
                    else maxPositive[1] = array.get(i);
                }
            }
        }


        if(maxPositive[0] * maxPositive[1] > maxNegative[0] * maxNegative[1]) {
            writer.write(String.valueOf(maxPositive[0] * maxPositive[1]));
        }
        else {
            writer.write(String.valueOf(maxNegative[0] * maxNegative[1]));
        }

        reader.close();
        writer.close();
    }
}
