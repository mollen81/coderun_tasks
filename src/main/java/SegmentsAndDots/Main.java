package SegmentsAndDots;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        List<List<Integer>> segments = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] line = reader.readLine().trim().split(" ");
            int firstEl = Integer.parseInt(line[0]);
            int secondEl = Integer.parseInt(line[1]);
            segments.add(i, List.of(firstEl, secondEl));
        }

        List<Integer> dotsLine = Arrays.stream(reader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .toList();
        StringBuilder sb = new StringBuilder();



        writer.write(sb.toString());

        reader.close();
        writer.close();
    }
}
