package BeautifulDaysAtTheMovies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int reverse(int number){
        int reverse = 0;
        while(number!=0){
            reverse = 10*reverse +number%10;
            number = number/10;
        }
        reverse += number;
        return reverse;
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int c = 0;
        for (int l = i; l <= j; l++) {
            if ((Math.abs(l-reverse(l)) % k) == 0) c++;
        }
        return c;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        System.out.println(String.valueOf(result));

        bufferedReader.close();
    }
}

