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

        long count = (long) Math.ceil(a + (double) b/3 - (double) c/3);

        if(count < 0) {
            count = 0;
        }

        writer.write(String.valueOf(count));

        reader.close();
        writer.close();
    }
}
