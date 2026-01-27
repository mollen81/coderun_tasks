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


        if(a == 0)
        {
            if (b == c * c)
            {
                return "MANY SOLUTIONS";
            }
            else
            {
                return "NO SOLUTION";
            }
        }

        else
        {
            if (c == 0)
            {
                if(((double)-b / (double)a) % 1 == 0)
                {
                    result.append(-b / a).append("\n");
                    return result.toString();
                }
            }

            if (b == 0)
            {
                if(((double)c*c / (double)a) % 1 == 0)
                {
                    result.append(c*c / a);
                    return result.toString();
                }
            }

            if(((c * c - (double)b) / a) % 1 == 0)
            {
                result.append((c * c - b) / a);
            }
        }



        if (result.isEmpty())
        {
            return "NO SOLUTION";
        }
        return result.toString();
    }
}
