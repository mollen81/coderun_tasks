package SequenceType;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int val1 = Integer.parseInt(reader.readLine().trim());
        boolean[] result = {true, true, true, true, true, true};

        while(true)
        {
            int val2 = Integer.parseInt(reader.readLine().trim());
            if(val2 == -2000000000) {
                break;
            }

            if(val1 == val2)
            {
                result[1] = false;
                result[3] = false;
            }
            else
            {
                result[0] = false;

                if(val1 > val2) {
                    result[2] = false;
                }
                if(val1 < val2) {
                    result[4] = false;
                }
            }

            val1 = val2;
        }


        if(result[0]) {
            writer.write("CONSTANT");
        }
        else if(result[1] && result[2]){
            writer.write("ASCENDING");
        }
        else if(result[2]){
            writer.write("WEAKLY ASCENDING");
        }
        else if(result[3]){
            writer.write("DESCENDING");
        }
        else if(result[4]){
            writer.write("WEAKLY DESCENDING");
        }
        else {
            writer.write("RANDOM");
        }


        reader.close();
        writer.close();
    }
}
