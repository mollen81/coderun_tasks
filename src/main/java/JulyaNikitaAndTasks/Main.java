package JulyaNikitaAndTasks;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        String input = reader.readLine();

        long a = Long.parseLong(input.split(" ")[0]);
        long b = Long.parseLong(input.split(" ")[1]);

        String result = Long.toString(a + b);
        writer.write(result);

        reader.close();
        writer.close();
    }
}
