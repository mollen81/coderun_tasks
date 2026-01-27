package equationWithRoots;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];

        for(int i = 0; i < 3; i ++)
        {
            input[i] = scanner.nextInt();
        }


        System.out.println(equationWithRoots.solve(input));
    }
}
