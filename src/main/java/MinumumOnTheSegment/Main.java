package MinumumOnTheSegment;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        Deque<Integer> deque = new ArrayDeque<>();

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList();



        reader.close();
        writer.close();
    }
}