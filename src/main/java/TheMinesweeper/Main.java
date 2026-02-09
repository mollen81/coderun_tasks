package TheMinesweeper;

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        String[][] field = new String[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                field[i][j] = "0";
            }
        }

        List<List<Integer>> bombsMap = new ArrayList<>(k);

        for(int i = 0; i < k; i++)
        {
            String[] line = reader.readLine().split(" ");
            int p = Integer.parseInt(line[0]);
            int q = Integer.parseInt(line[1]);
            bombsMap.add(List.of(p - 1, q - 1));

            addFieldValues(field, n, m, p, q);
        }

        StringBuilder stringField = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            StringBuilder line = new StringBuilder();
            for(int j = 0; j < m; j++)
            {
                if(bombsMap.contains(List.of(i, j))){
                    line.append("* ");
                }
                else{
                    line.append(field[i][j]).append(" ");
                }

                if(j == m-1){
                    line.append("\n");
                }
            }
            stringField.append(line);
        }


        writer.write(stringField.toString());
        reader.close();
        writer.close();
    }

    public static void addFieldValues(String[][] field, int n, int m, int p, int q)
    {
        if(p == 1)
        {
            if(q == 1) {
                for(int i = 0; i < 2 && i < n; i++) {
                    for(int j = 0; j < 2 && j < q; j++){
                        field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                    }
                }
            }
            else if(q == m) {
                for(int i = 0; i < 2 && i < n; i++) {
                    for(int j = q - 2; j < q && q > -1; j++){
                        field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                    }
                }
            }
            else
            {
                for(int i = 0; i < 2 && i < n; i++){
                    for(int j = q - 2; j < q + 1 && q > -1; j++){
                        field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                    }
                }
            }
        }
        else if(p == n)
        {
            if(q == 1){
                for(int i = p-2; i < p && i > -1; i++){
                    for(int j = 0; j < 2 && j < q; j++) {
                        field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                    }
                }
            }
            else if(q == m){
                for(int i = p-2; i < p && i > -1; i++){
                    for(int j = q-2; j < q && j > -1; j++) {
                        field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                    }
                }
            }
            else{
                for(int i = p-2; i < p && i > -1; i++){
                    for(int j = q-2; j < q+1 && q > -1; j++){
                        field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                    }
                }
            }
        }
        else if(q == 1)
        {
            for(int i = p-2; i < p+1 && i > -1; i++){
                for(int j = 0; j < 2 && j < q; j++){
                    field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                }
            }
        }
        else if(q == m)
        {
            for(int i = p-2; i < p+1 && i > -1; i++){
                for(int j = q-2; j < q && j > -1; j++){
                    field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                }
            }
        }
        else
        {
            for(int i = p-2; i < p+1 && i > -1; i++){
                for(int j = q-2; j < q+1 && j > -1; j++)
                {
                    field[i][j] = String.valueOf(Integer.parseInt(field[i][j]) + 1);
                }
            }
        }
    }
}
