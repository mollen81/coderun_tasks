package SettingTags;

import java.io.*;

public class SettingTags
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */
        int input = Integer.parseInt(reader.readLine());

        writer.write(Integer.toString(calculate(input)));

        reader.close();
        writer.close();
    }

    public static int calculate(int input)
    {
        if(input == 1)
        {
            return 1;
        }

        int[] tags = new int[input];

        tags[0] = 1;
        tags[1] = 1;

        for(int i = 2; i < tags.length; i++)
        {
            tags[i] = tags[i - 1] + tags[i - 2];
        }

        int sum = 2;
        for(int i = 2; i < tags.length; i++)
        {
            sum += tags[i];
        }

        return sum;
    }
}
