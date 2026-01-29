package Triangle;

import java.io.*;

public class Triangle
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
        int n = Integer.parseInt(reader.readLine());
        writer.write(String.valueOf(n));
        */

        int side1 = Integer.parseInt(reader.readLine());
        int side2 = Integer.parseInt(reader.readLine());
        int side3 = Integer.parseInt(reader.readLine());

        if((side1 + side2 <= side3) || (side2 + side3 <= side1) || (side1 + side3 <= side2))
        {
            writer.write("NO");
        }
        else
        {
            writer.write("YES");
        }

        reader.close();
        writer.close();
    }
}
