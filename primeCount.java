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
     * Complete the 'primeCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */
    /*Leonard loves primes and created q qureies where each query takes the form 
     * of an integer n, for each n, count the maximum number of distrinct prie factors of any number in the inclusive range [1,n]
     * Note: recall that a prime number is only divisible by 1 and itself, and 1 is not a prime number 
     * example: 
     * n = 100
     * The maximum number of distinct prime factors for values less than or equal to 100 is 3
     * Definition of a prime factor 
     * -a factor that is a prime number 
     * -in other words: any of the prime numbers thatn can be multiplied to give the original number 
     * The prime factors of 15 are 3 and 6 because 3 and 5 are prime numbers 
     */

    public static int primeCount(long n) {
    // Write your code here
    // we need some product counter 
    //by the integer property, int * int -> int 
    int totalProduct = 1;
    int primeCount = 0;
    // now we should iterate to n and ensure that the primes don't generate a product greater than n
    for(int i = 0; i < n; i++){
        if (fermat(i)){
            totalProduct *= i;
            primeCount++;
        }
        if (totalProduct >= n){
            return primeCount - 1;
        }
    }
    return 0;
    }
    public static boolean fermat (int n){
        return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                int result = Result.primeCount(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
