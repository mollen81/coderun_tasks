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

        if(isPalindrome(numbers, 0, n - 1))
        {
            writer.write("0");
        }
        else
        {
            int palindromeStartIndex = 0;
            for(int i = 0; i < n; i ++)
            {
                if(isPalindrome(numbers, i, n - 1))
                {
                    palindromeStartIndex = i;
                    break;
                }
            }

            writer.write(palindromeStartIndex + "\n");

            StringBuilder sb = new StringBuilder();
            for(int i = palindromeStartIndex - 1; i > -1; i--)
            {
                sb.append(numbers.get(i).toString()).append(" ");
            }

            writer.write((sb.toString()).trim());
        }

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
