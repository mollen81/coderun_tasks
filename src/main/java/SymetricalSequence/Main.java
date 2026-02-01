package SymetricalSequence;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList();


        while(!isPalindrome(numbers, n))
        {

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
