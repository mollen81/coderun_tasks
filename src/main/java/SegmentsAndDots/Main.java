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
        HashMap<Integer, Integer> dots = new HashMap<>(m);

        for(int i = 0; i < n; i++) {
            String[] line = reader.readLine().trim().split(" ");
            segments[i][0] = Integer.parseInt(line[0]);
            segments[i][1] = Integer.parseInt(line[1]);
        }

        String[] dotsLine = reader.readLine().trim().split(" ");
        for(int i = 0; i <  m; i++) {
            dots.put(Integer.parseInt(dotsLine[i]), 0);
        }


        dots.forEach((key, value) -> {
            for(int i = 0; i < n; i++) {
                if(key >= segments[i][0] && key <= segments[i][1]) {
                    dots.replace(key, dots.get(key) + 1);
                }
            }
            try {
                writer.write(dots.get(key) + " ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
                });


        reader.close();
        writer.close();
    }
}
