package equationWithRoots;


public class equationWithRoots
{
    public static String solve(int[] input)
    {
        StringBuilder result = new StringBuilder();

        int a = input[0];
        int b = input[1];
        int c = input[2];

        if (c < 0)
        {
            return "NO SOLUTION";
        }


        if ((a == 0 && Math.sqrt(b) == c) || (a == 0 && b == 0 && c == 0))
        {
            return "MANY SOLUTIONS";
        }


        if (c == 0)
        {
            for(int x = -100; x < 101; x++)
            {
                if(a * x == -b)
                {
                    result.append(x).append("\n");
                    return result.toString();
                }
            }
        }

        for(int x = -10000; x < 100001; x++)
        {
            if (a * x + b < 0)
            {
                continue;
            }

            if (a * x + b == Math.pow(c, 2))
            {
                result.append(x).append("\n");
                return result.toString();
            }
        }

        return result.toString();
    }
}
