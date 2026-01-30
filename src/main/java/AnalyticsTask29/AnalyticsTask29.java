package AnalyticsTask29;

import java.io.*;

public class AnalyticsTask29 {
    public void quadraticEquation(int a, int b, int c, Writer writer) throws IOException
    {
        double d = (double) b * b - 4 * a * c;
        if (d < 0)
        {
            writer.write("0");
        }
        else if (d == 0)
        {
            double x = (double) -b / (2 * a);
            writer.write("1\n");
            writer.write(Double.toString(x));
        }
        else if (d > 0)
        {
            double x1 = (-b - Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b + Math.sqrt(d)) / (2.0 * a);
            writer.write("2\n");
            writer.write(Double.toString(x1) + " " + x2);
        }
    }
}
