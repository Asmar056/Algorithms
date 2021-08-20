import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> bird = new HashMap<>();
        int key = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (bird.containsKey(arr.get(i))){
                bird.put(arr.get(i), bird.get(arr.get(i)) + 1);
            }else {
                bird.put(arr.get(i), 1);
            }
        }
        key = Collections.max(bird.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }

}

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result3.migratoryBirds(arr);

        System.out.println(String.valueOf(result));
        bufferedReader.close();
    }
}
