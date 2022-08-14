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
     * Complete the 'solve' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */
    /*Mary has an n * m piece of paper that she wants to cut into 1 * 1 pieces according to the following rules
     * She can only cut one piece of paper at a time, meaning she cannot foldthe paper or layer already cut pieces on top of on another 
     *Each cut is a straight line from one side of the paper to the other side of the paper 
     */

    public static long solve(int n, int m) {
    // Write your code here
    /*Given n and m, find and print the minimum number of cuts Mary must make to cut the paper into 1 * 1 unit in size  */
    //small nuiance with this problem you have to type cast the ints just to ensure you don't run out of memory
    return ((long)n*(long)m) -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        long result = Result.solve(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
