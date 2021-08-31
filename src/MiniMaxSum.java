import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result9 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long minSum = 0; long maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }

        for (int i = 1; i < 5; i++) {
            maxSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result9.miniMaxSum(arr);

        bufferedReader.close();
    }
}
