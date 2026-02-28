package SegmentsAndDots;

import java.io.*;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        int[][] segments = new int[n][2];

        for(int i = 0; i < n; i++) {
            String[] line = reader.readLine().trim().split(" ");
            segments[i][0] = Integer.parseInt(line[0]);
            segments[i][1] = Integer.parseInt(line[1]);
        }

        List<Integer> dotsLine = Arrays.stream(reader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .toList();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <  m; i++) {
            int segmentsCount = 0;
            for(int j = 0; j < n; j++) {
                if (dotsLine.get(i) >= segments[j][0] && dotsLine.get(i) <= segments[j][1]) {
                    segmentsCount++;
                }
            }
            sb.append(segmentsCount).append(" ");
        }

        writer.write(sb.toString());

        reader.close();
        writer.close();
    }
}
