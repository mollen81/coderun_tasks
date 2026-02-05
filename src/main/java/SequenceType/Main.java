package SequenceType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> array = new ArrayList<>();

        while(true)
        {
            Integer value = Integer.parseInt(reader.readLine());
            if(!value.equals(-2000000000))
            {
                array.add(Integer.parseInt(reader.readLine()));
            }
            else
            {
                break;
            }
        }

        boolean constant = true;
        boolean ascending = true;
        boolean weaklyAscending = true;
        boolean descending = true;
        boolean weaklyDescending = true;
        boolean random = true;
        for(int i = 0; i < array.size() - 2; i++)
        {
            if(constant && !Objects.equals(array.get(i), array.get(i + 1))) // CONSTANT
            {
                constant = false;
            }

            if(ascending && array.get(i) <= array.get(i + 1)) // ASCENDING
            {
                ascending = false;
            }

            if(weaklyAscending && array.get(i) < array.get(i + 1)) // WEAKLY ASCENDING
            {
                weaklyAscending = false;
            }

            if(descending && array.get(i) >= array.get(i + 1)) // DESCENDING
            {
                descending = false;
            }

            if(weaklyDescending && array.get(i) > array.get(i + 1)) // WEAKLY DESCENDING
            {
                weaklyDescending = false;
            }
        }

        if(constant || ascending || weaklyAscending || descending || weaklyDescending)
        {
            random = false;
        }

        if(constant)
        {
            writer.write("CONSTANT");
        }
        else if(ascending)
        {
            writer.write("ASCENDING");
        }
        else if(weaklyAscending)
        {
            writer.write("WEAKLY ASCENDING");
        }
        else if(descending)
        {
            writer.write("DESCENDING");
        }
        else if(weaklyDescending)
        {
            writer.write("WEAKLY DESCENDING");
        }
        else
        {
            writer.write("RANDOM");
        }

        reader.close();
        writer.close();
    }
}
