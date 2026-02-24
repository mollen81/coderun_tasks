package SegmentsAndDots;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[][] segments = new int[n][2];
        Map<Integer, Integer> dots = new HashMap<>(m);

        for(int i = 0; i < n; i++) {
            String[] line = reader.readLine().trim().split(" ");
            segments[i][0] = Integer.parseInt(line[0]);
            segments[i][1] = Integer.parseInt(line[1]);
        }

        String[] dotsLine = reader.readLine().trim().split(" ");
        for(int i = 0; i <  m; i++) {
            dots.put(Integer.parseInt(dotsLine[i]), 0);
        }


        reader.close();
        writer.close();
    }
}
