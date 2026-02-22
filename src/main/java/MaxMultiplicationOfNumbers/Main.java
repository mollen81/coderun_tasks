package MaxMultiplicationOfNumbers;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> array = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] maxPositive = new int[] {0, 0};
        int[] maxNegative = new int[] {0, 0};

        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) > maxPositive[0] || array.get(i) > maxPositive[1]) {
                if (maxPositive[0] == 0) {
                    maxPositive[0] = array.get(i);
                    sort(maxPositive);
                }
                else if (maxPositive[1] == 0) {
                    maxPositive[1] = array.get(i);
                    sort(maxPositive);
                }

                else  {
                    if (array.get(i) > maxPositive[1]) {
                        maxPositive[0] = array.get(i);
                        sort(maxPositive);
                    }
                    else if (array.get(i) > maxPositive[0]) maxPositive[0] = array.get(i);
                }
            }

            if(array.get(i) < maxNegative[0] || array.get(i) < maxNegative[1]) {
                if (maxNegative[0] == 0) {
                    maxNegative[0] = array.get(i);
                    sort(maxNegative);
                }
                else if (maxNegative[1] == 0) {
                    maxNegative[1] = array.get(i);
                    sort(maxNegative);
                }

                else {
                    if (array.get(i) < maxNegative[0]) {
                        maxNegative[1] = array.get(i);
                        sort(maxNegative);
                    }
                    else if (array.get(i) < maxNegative[1]) maxNegative[1] = array.get(i);
                }

            }
        }

        sort(maxNegative);
        sort(maxPositive);

        if(array.size() == 2) {
            writer.write(maxNegative[0] + " " + maxPositive[1]);
        }
        else {
            if ((long) maxPositive[0] * maxPositive[1] > (long) maxNegative[0] * maxNegative[1]) {
                writer.write(maxPositive[0] + " " + maxPositive[1]);
            } else {
                writer.write(maxNegative[0] + " " + maxNegative[1]);
            }
        }

        reader.close();
        writer.close();
    }


    static void sort(int[] nums)
    {
        if (nums[0] > nums[1]) {
            int temp = nums[1];
            nums[1] = nums[0];
            nums[0] = temp;
        }
    }

    static void sort(List<Integer> nums)
    {
        if(nums.get(0) > nums.get(1)) {
            int temp = nums.get(1);
            nums.removeFirst();
            nums.add(temp);
        }
    }
}
