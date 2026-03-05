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

        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().trim().split(" ");
            int firstEl = Integer.parseInt(line[0]);
            int secondEl = Integer.parseInt(line[1]);
            segments.add(i, List.of(firstEl, secondEl));
        }

        List<Integer> dotsLine = Arrays.stream(reader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .toList();


        List<List<Integer>> negativeSegments = new ArrayList<>();
        List<List<Integer>> positiveSegments = new ArrayList<>();
        List<List<Integer>> otherSegments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (segments.get(i).getFirst() < 0 && segments.get(i).getLast() < 0) {
                negativeSegments.add(segments.get(i));
            } else if (segments.get(i).getFirst() >= 0 && segments.get(i).getLast() > 0) {
                positiveSegments.add(segments.get(i));
            } else {
                otherSegments.add(segments.get(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int currentDot = dotsLine.get(i);
            int dotResult = 0;

            if (currentDot < 0) {
                for (int j = 0; j < positiveSegments.size(); j++) {
                    List<Integer> currentSegment = positiveSegments.get(j);
                    if (currentDot >= Math.min(currentSegment.getFirst(), currentSegment.getLast())
                            && currentDot < Math.min(currentSegment.getFirst(), currentSegment.getLast())) {
                        dotResult++;
                    }
                }
                sb.append(dotResult).append(" ");
            } else {
                for (int j = 0; j < negativeSegments.size(); j++) {
                    List<Integer> currentSegment = negativeSegments.get(j);
                    if (currentDot >= Math.min(currentSegment.getFirst(), currentSegment.getLast())
                            && currentDot < Math.min(currentSegment.getFirst(), currentSegment.getLast())) {
                        dotResult++;
                    }
                }
                sb.append(dotResult).append(" ");
            }

            writer.write(sb.toString());

            reader.close();
            writer.close();
        }
    }
}
