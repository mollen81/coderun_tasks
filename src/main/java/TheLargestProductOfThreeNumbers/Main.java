package TheLargestProductOfThreeNumbers;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>(Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList());

        writer.write(getMultipliers(list).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

        reader.close();
        writer.close();
    }

    public static List<Integer> getMultipliers(List<Integer> array) throws NullPointerException
    {
        PriorityQueue<Integer> maxValues = new PriorityQueue<>(3);
        PriorityQueue<Integer> minValues = new PriorityQueue<>(2, Comparator.reverseOrder());

        for(Integer value : array)
        {
            if(maxValues.size() < 3)
            {
                maxValues.offer(value);
            }
            else if(value > maxValues.peek())
            {
                maxValues.poll();
                maxValues.offer(value);
            }

            if(minValues.size() < 2)
            {
                minValues.offer(value);
            }
            else if(value < minValues.peek())
            {
                minValues.poll();
                minValues.offer(value);
            }
        }

        int max1 = maxValues.poll();
        int max2 = maxValues.poll();
        int max3 = maxValues.poll(); // largest value

        int min1 = minValues.poll(); // smallest value
        int min2 = minValues.poll();

        if((long) max1 * max2 * max3 > (long) min1 * min2 * max3)
        {
            return List.of(max1, max2, max3);
        }
        else
        {
            return List.of(min1, min2, max3);
        }

    }

}
