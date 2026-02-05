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

        List<Integer> extendedList = new ArrayList<>();


        if(isPalindrome(numbers))
        {
            writer.write("0");
        }
        else
        {
            int left = 0;
            int right = numbers.size() - 1;

            while(!numbers.subList(right, numbers.size() - 1).reversed()
                    .equals(numbers.subList(0, right)))
            {
                numbers.add(numbers.get(right - 1 - left));
                left++;
            }

            writer.write(numbers.size() - n + "\n" + numbers.subList(numbers.size() - n - 1, numbers.size() - 1));
        }



        reader.close();
        writer.close();
    }

    public static boolean isPalindrome(@NotNull List<Integer> list)
    {
        if(list.size() % 2 == 0)
        {
            return list.subList(0, list.size() / 2).equals(list.subList(list.size() / 2, list.size()).reversed());
        }
        else
        {
            return list.subList(0, list.size() / 2).equals(list.subList(list.size() / 2 + 1, list.size()).reversed());
        }
    }
}
