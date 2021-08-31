import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result11 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float p = 0, n = 0, z = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) z++;
            else if (arr.get(i) > 0) p++;
            else if (arr.get(i) < 0) n++;
        }

        System.out.printf( "%.6f\n", p/arr.size());
        System.out.printf( "%.6f\n", n/arr.size());
        System.out.printf( "%.6f\n", z/arr.size());

    }

}

public class PlusMinus   {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result11.plusMinus(arr);

        bufferedReader.close();
    }
}
