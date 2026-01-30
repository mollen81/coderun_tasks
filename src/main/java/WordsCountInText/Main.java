package WordsCountInText;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        String input = reader.lines().collect(Collectors.joining("\n"));

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(input.split("\\s+")));

        writer.write(Integer.toString(uniqueWords.size()));
        uniqueWords.remove("");

        reader.close();
        writer.close();
    }
}
