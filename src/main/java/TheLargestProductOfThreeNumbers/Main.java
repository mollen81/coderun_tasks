package TheLargestProductOfThreeNumbers;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>(Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .toList());

        Collections.sort(list);

        if(list.get(list.size() - 3) * list.get(list.size() - 2) * list.getLast() < list.getFirst() * list.get(1) * list.get(2))
        {
            writer.write(list.getFirst() + " " + list.get(1) + " " + list.get(2));
        }
        else
        {
            writer.write(list.getLast() + " " + list.get(list.size() - 2) + " " + list.get(list.size() - 3));
        }


        reader.close();
        writer.close();
    }
}
