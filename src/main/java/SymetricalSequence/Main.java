package SymetricalSequence;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> numbers = new ArrayList<>(Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList());


        System.out.println(isPalindrome(numbers, 0, numbers.size() - 1));

        reader.close();
        writer.close();
    }

    public static boolean isPalindrome(@NotNull List<Integer> list, int start, int end)
    {
        while(start < end)
        {
            if(!Objects.equals(list.get(start), list.get(end))) return false;
            start++;
            end--;
        }

        return true;
    }
}
