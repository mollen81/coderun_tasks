package SymetricalSequence;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> numbers = new ArrayList<>(Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList());

        if(n == 1)
        {
            writer.write("0");
        }
        else if(n == 2)
        {
            writer.write("1" + Integer.toString(numbers.getFirst()));
        }
        else if(n == 3)
        {
            writer.write("2" + numbers.get(n - 2) + numbers.getFirst());
        }
        else
        {
            int middleIndex = 0;
            int leftIndex = 0;
            for(int i = 1; i < n - 3; i++)
            {
                if(numbers.get(i - 1).equals(numbers.get(i + 3))
                        && numbers.get(i).equals(numbers.get(i + 2)) )
                {
                    middleIndex = i + 1;
                }
                else if(numbers.get(i - 1).equals(numbers.get(i + 2))
                        && numbers.get(i).equals(numbers.get(i + 1)))
                {
                    leftIndex = i;
                }
            }


            if(middleIndex != 0)
            {
                if(n - 1 == middleIndex)
                {
                    for (int i = middleIndex - 1; i > -1; i--)
                    {
                        numbers.add(numbers.get(i));
                    }
                }
                else
                {
                    for (int i = n - 1 - middleIndex; i > -1; i--)
                    {
                        numbers.add(i);
                    }
                }
            }
            if(leftIndex != 0)
            {
                if(n - 1 == leftIndex)
                {
                    for (int i = leftIndex - 1; i > - 1; i--)
                    {
                        numbers.add(numbers.get(i));
                    }
                }
                else
                {
                    for (int i = n - 1 - leftIndex; i > -1; i--)
                    {
                        numbers.add(numbers.get(i));
                    }
                }
            }
        }



        reader.close();
        writer.close();
    }

    public static boolean isPalindrome(@NotNull List<Integer> list, int n)
    {
        if(n % 2 == 0)
        {
            return list.subList(0, n / 2).equals(list.subList(n / 2, n).reversed());
        }
        else
        {
            return list.subList(0, n / 2).equals(list.subList(n / 2 + 1, n).reversed());
        }
    }
}
