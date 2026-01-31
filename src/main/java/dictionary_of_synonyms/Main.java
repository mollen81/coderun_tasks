package dictionary_of_synonyms;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> dictionary = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());
        for(int i = 0; i < n; i++)
        {
            String[] line = reader.readLine().split(" ");
            dictionary.put(line[0], line[1]);
        }

        String word = reader.readLine();

        if(dictionary.containsKey(word))
        {
            writer.write(dictionary.get(word));
        }
        else
        {
            for(Map.Entry<String, String> entry : dictionary.entrySet())
            {
                if(entry.getValue().equals(word))
                {
                    writer.write(entry.getKey());
                    break;
                }
            }
        }

        reader.close();
        writer.close();
    }
}
