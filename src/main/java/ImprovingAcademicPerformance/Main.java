package ImprovingAcademicPerformance;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(reader.readLine().trim());
        long b = Long.parseLong(reader.readLine().trim());
        long c = Long.parseLong(reader.readLine().trim());

        double score = (2 * a + 3 * b + 4 * c) / ((double) a + b + c);
        double diff = 4.0 - score;

        long count = (long) Math.ceil(diff*(a  + b + c) / (5 - diff));
        if(count < 0) {
            count = 0;
        }

        writer.write(String.valueOf(count));

        reader.close();
        writer.close();
    }
}
