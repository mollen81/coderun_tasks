package nod_nok;

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

        String[] input = reader.readLine().split(" ");
        int a1, a2;
        if(Integer.parseInt(input[0]) > Integer.parseInt(input[1]))
        {
            a1 = Integer.parseInt(input[1]);
            a2 = Integer.parseInt(input[0]);
        }
        else
        {
            a1 = Integer.parseInt(input[0]);
            a2 = Integer.parseInt(input[1]);
        }

        int nod = findNod(a1, a2);

        writer.write(nod + " " + (a1 * a2) / nod);

        

        reader.close();
        writer.close();
    }

    public static int findNod(int a1, int a2)
    {
        for(int i = 1; i < a1 / 2; i++)
        {
            if(a1 % ((double) a1 / i) == 0 && a2 % ((double) a1 / i) == 0)
            {
                return a1 / i;
            }
        }

        return 1;
    }
}
