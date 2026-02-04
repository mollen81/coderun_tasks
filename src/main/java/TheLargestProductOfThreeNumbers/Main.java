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

        if(list.getLast() * list.get(list.size() - 2) * list.get(list.size() - 3)
                < list.getFirst() * list.get(1) * list.getLast())
        {
            writer.write(list.getFirst() + " " + list.get(1) + " " + list.getLast());
        }
        else
        {
            writer.write(list.getLast() + " " + list.get(list.size() - 2) + " " + list.get(list.size() - 3));
        }


        reader.close();
        writer.close();
    }
}
