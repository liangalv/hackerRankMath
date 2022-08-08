import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gameWithCells' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */
    /*Luke is daydreaming in Math class. He has a sheet of graph paper with n rows and m columns
     * and he images there is any army base in each cell for a total of n * m bases 
     * He wants to drop supplies at a strategeic points on the sheet 
     * marking each drop point with a red dot 
     * if a base contains at least one package inside or on top of its border fence, then it's considered to be supplied 
     * given n and m, what's the minimum number of packages that Luke must drop to supply all his bases? 
     */

    public static int gameWithCells(int n, int m) {
    // Write your code here
    // in the case where the number of rows is even 
    if (n % 2 == 0){
        n = n / 2;
    }// in the case where the number of rows are odd
    else{
        n = (n+1) /2;
    }
    //in the case where the number of columns is even 
    if (m % 2 == 0){
        m = m/2;
    }// i n the case where the number of columns is odd
    else{
        m = (m + 1) /2;
    }
    return m * n;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.gameWithCells(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
