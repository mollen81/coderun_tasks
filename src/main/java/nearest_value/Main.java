package nearest_value;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int[] array = new int[n];
        String[] line = reader.readLine().split(" ");

        for(int i = 0; i < n; i++)
        {
            array[i] = Integer.parseInt(line[i]);
        }

        int targetValue = Integer.parseInt(reader.readLine());
        int result = n;

        for(int i = 0; i < n; i++)
        {
            if(Math.abs(targetValue - array[i]) <= result)
            {
                result = array[i];
            }
        }


        writer.write(Integer.toString(result));

        reader.close();
        writer.close();
    }
}
