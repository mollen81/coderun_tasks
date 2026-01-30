package IsTheListGrowing;

import java.io.*;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        boolean isIncreasing = true;

        for(int i = 0; i < input.length - 1; i++)
        {
            if(Integer.parseInt(input[i + 1]) <= Integer.parseInt(input[i]))
            {
                isIncreasing = false;
                break;
            }
        }

        if(isIncreasing == true)
        {
            writer.write("YES");
        }
        else
        {
            writer.write("NO");
        }

        reader.close();
        writer.close();
    }
}
